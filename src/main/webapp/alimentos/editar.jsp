<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="ISO-8859-1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/style.css">
    <link rel="apple-touch-icon" sizes="180x180" href="${pageContext.request.contextPath}/favicon/apple-touch-icon.png">
    <link rel="icon" type="image/png" sizes="32x32" href="${pageContext.request.contextPath}/favicon/favicon-32x32.png">
    <link rel="icon" type="image/png" sizes="16x16" href="${pageContext.request.contextPath}/favicon/favicon-16x16.png">
    <title>Editar Alimento | Health Track</title>
</head>

<body>

    <nav role="navigation" class="menu-mobile">
        <div id="menuToggle">

            <input type="checkbox" />
            <span></span>
            <span></span>
            <span></span>

            <ul id="menu">
                <li><a href="../dashboard">Dashboard</a></li>
                <li>
                    <a href="../peso">Pesos</a>
                </li>
                <li>
                    <a href="../pressao">Press?o arterial</a>
                </li>
                <li>
                    <a href="../alimento">Alimenta??o</a>
                </li>
                <li>
                    <a href="../atividade">Atividades</a>
                </li>
            </ul>
        </div>
    </nav>

    <div class="menu">

        <ul>
            <li><a href="../dashboard">Dashboard</a></li>
            <li>
                <a href="../peso">Pesos</a>
            </li>
            <li>
                <a href="../pressao">Press?o arterial</a>
            </li>
            <li>
                <a href="../alimento" class="selected">Alimenta??o</a>
            </li>
            <li>
                <a href="../atividade">Atividades</a>
            </li>
        </ul>

        <button><a href="../login">Sair</a></button>
    </div>

    <div class="main alimentos">

        <div class="header">

            <div class="text">

                <div class="title">Editar alimento</div>

            </div>

            <div class="foto" onclick="perfil()"></div>

        </div>

        <form class="form">

            <div class="item">
                <label for="categoria">Categoria</label>
                <select name="categoria" required>

                    <option value="" disabled>Selecione</option>
                    <option value="cafe">Caf? da manh?</option>
                    <option value="lanche">Lanche leve</option>
                    <option value="almoco_janta">Almo?o/Janta</option>
                    <option value="fruta">Fruta</option>

                </select>
            </div>

            <div class="item">
                <label for="calorias">Qtd. de calorias</label>
                <input class="input" type="text" value="354" required>
            </div>

            <div class="item">
                <label for="descricao">Descri??o (opcional)</label>
                <input class="input" type="text" value="P?o com presunto e queijo">
            </div>

            <div class="item">
                <label for="data">Data e hora do consumo</label>
                <input class="input" type="datetime-local" value="2021-06-30T06:00:00" required>
            </div>

            <div class="button">

                <button class="primary">Salvar</button>

            </div>

    </div>

    </form>

</body>

</html>

<script>
    function perfil() {
        window.location.href = "${pageContext.request.contextPath}/perfil/perfil.html";
    }
</script>