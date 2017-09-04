<%-- Thales Douglas de Souza 4º TADSB - NOTURNO --%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <link href="./CSS/estilo.css" rel="stylesheet" type="text/css"/>

        <title>Exercicio01</title>
    </head>
    <body>
        <section class="conteiner-fluid">
            <div class="row">
                <c:forEach var="produto" items="${produtos}">
                    <div class="col-md-4 col-xs-12 col-sm-4 col-lg-4">
                        <div class="todoProduto">
                            <div class="nomeProduto">
                                <h1 class="nome"> ${produto.nome} </h1>
                            </div>
                            <div class="idProduto">    
                                <h1 class="id"> ID: ${produto.id}  </h1>
                            </div>
                            <div class="precoProduto">    
                                <h1 class="preco"> R$ ${produto.preco}  </h1>
                            </div>
                            <div class="descricaoTituloProduto">    
                                <h1 class="descricaoTitulo"> Descrição </h1>
                            </div>
                            <div class="descricaoProduto">
                                <h1 class="descricao"> ${produto.descricao}</h1>
                            </div>
                        </div>
                    </div>    
                </c:forEach>   
            </div>
        </section>
    </body>
</html>


