package com.rehnuma.web.RESTTemplate.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rehnuma.web.RESTTemplate.model.Object;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.io.Closeable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

@Controller
public class RESTControllerServices {

//    @Autowired
//    private RestTemplate restTemplate;

    @GetMapping("/")
    public String requestHandler(ModelMap model) throws IOException {

        String urlQuery="https://rxnav.nlm.nih.gov/REST/interaction/interaction.json?rxcui=341248";
        URL url=new URL(urlQuery);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();
        String inline="";
        int responseCode=conn.getResponseCode();
        if(responseCode!=200){
            throw new RuntimeException("HttpResponseCode: "+responseCode);
        }else{

            Scanner sc = new Scanner(url.openStream());
            while(sc.hasNext())
            {
                inline+=sc.nextLine();
            }
            System.out.println("JSON data in string format");
            System.out.println(inline);
            sc.close();

        }
//        ObjectMapper objectMapper= new ObjectMapper();
//        Object object=objectMapper.readValue(inline,Object.class);
//        model.put("obj",object);


        return "index";

    }
    @GetMapping("/api")
    public String getApi(ModelMap model) throws IOException {
        String url="https://rxnav.nlm.nih.gov/REST/interaction/interaction.json?rxcui=341248";
        CloseableHttpClient client= HttpClients.createDefault();
        HttpGet request = new HttpGet(url);
        HttpResponse response = client.execute(request);
        String jsonString = EntityUtils.toString(response.getEntity());

        ObjectMapper mapper = new ObjectMapper();
        Object object=mapper.readValue(jsonString,Object.class);
        model.put("obj", object);

        return "table";

    }





}
