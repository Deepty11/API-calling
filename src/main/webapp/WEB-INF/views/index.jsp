<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Json </title>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
            integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
            crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
            integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
            crossorigin="anonymous"></script>
    <script type="text/javascript"
            src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"
    >
    </script>

</head>
<body>

<script>
    $(document).ready(function(){
        var str=${jsonString};
        var userInput = str.userInput;
        console.log(userInput.length);

        for (var i = 0; i < userInput.length; i++) {
            for (var key in userInput[i]) {
                $("#userInput").append("<div>"+ key + " : " + userInput[i] +"</div>");
            }
        }
        $("#disclaimer").append("<div>"+ str.nlmDisclaimer +"</div>");



    });
</script>

<div class="container">
    <div id="disclaimer"></div>
    <div id="userInput"></div>
</div>

</body>
</html>