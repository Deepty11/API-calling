<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Convert JSON Data to HTML Table</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <style>
        .noShow {
            color: red;
        }

        .userInputStyle{
            margin-top: 2rem;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="row">
        <strong>nlDisclaimer:</strong>
        <p>${obj.nlmDisclaimer}</p>
    </div>

    <div class="row">
        <strong>userInput: </strong>

        <p class="userInputStyle">
            <strong>Sources: </strong>
            <c:forEach var="val" items="${obj.userInput.sources}">
                <c:choose>
                    <c:when test="${not empty val}">
                        ${val}
                    </c:when>
                    <c:otherwise>
                        <strong class="noShow">Nothing to show. </strong>
                    </c:otherwise>
                </c:choose>
            </c:forEach>
            <strong>rxcui: </strong>${obj.userInput.rxcui}
        </p>
    </div>

    <div class="row">
        <table class="table table-bordered">
            <thead>
               <th>sourceDisclaimer</th>
               <th>sourceName</th>
               <th>interactionTypes</th>
            </thead>
            <tbody>
               <c:forEach var="intType" items="${obj.interactionTypeGroup}">
               <tr>
                   <td>${intType.sourceDisclaimer}</td>
                   <td>${intType.sourceName}</td>
                   <td>
                       <table class="table table-bordered">
                           <thead>
                               <th>Comment</th>
                               <th>minConceptItem</th>
                               <th>interactionPair</th>
                           </thead>
                           <c:forEach var="type" items="${intType.interactionTypes}">
                               <tr>
                                   <td>${type.comment}</td>
                                   <td>
                                       <div class="row">
                                           <strong>rxcui :</strong> ${type.minConceptItems.rxcui}
                                       </div>
                                       <div class="row">
                                           <strong>name :</strong> ${type.minConceptItems.name}
                                       </div>
                                       <div class="row">
                                           <strong>tty :</strong> ${type.minConceptItems.tty}
                                       </div>
                                   </td>
                                   <td>
                                       <table>
                                           <thead>
                                                <th>interactionConcept</th>
                                                <th>severity</th>
                                                <th>description</th>
                                           </thead>
                                           <c:forEach var="pair" items="${type.interactionPair}">
                                               <tr>
                                                   <td>
                                                       <table class="table table-bordered">
                                                           <thead>
                                                                <th>minConceptItem</th>
                                                                <th>sourceConceptItem</th>
                                                           </thead>
                                                           <c:forEach var="concept" items="${pair.interactionConcepts}">
                                                               <tr>
                                                                   <td>
                                                                       <div class="row">
                                                                           <strong>rxcui : </strong>${concept.minConceptItem.rxcui}
                                                                       </div>
                                                                       <div class="row">
                                                                           <strong>name : </strong>${concept.minConceptItem.name}
                                                                       </div>
                                                                       <div class="row">
                                                                           <strong>tty : </strong>${concept.minConceptItem.tty}
                                                                       </div>
                                                                   </td>
                                                                   <td>
                                                                       <div class="row">
                                                                           <strong>id : </strong>${concept.sourceConceptItem.id}
                                                                       </div>
                                                                       <div class="row">
                                                                           <strong>name : </strong>${concept.sourceConceptItem.name}
                                                                       </div>
                                                                       <div class="row">
                                                                           <strong>url : </strong>${concept.sourceConceptItem.url}
                                                                       </div>
                                                                   </td>
                                                               </tr>
                                                           </c:forEach>
                                                       </table>
                                                   </td>
                                                   <td>
                                                       <str>severity : </str>${pair.severity}
                                                   </td>
                                                   <td>
                                                       <str>description : </str>${pair.description}
                                                   </td>
                                               </tr>
                                           </c:forEach>
                                       </table>

                                   </td>
                               </tr>
                           </c:forEach>
                       </table>
                   </td>
               </tr>
               </c:forEach>
            </tbody>
        </table>
    </div>

</div>
</body>


</html>
