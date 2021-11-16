<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="ISO-8859-1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../assets/style.css">
    <link rel="apple-touch-icon" sizes="180x180" href="/favicon/apple-touch-icon.png">
    <link rel="icon" type="image/png" sizes="32x32" href="/favicon/favicon-32x32.png">
    <link rel="icon" type="image/png" sizes="16x16" href="/favicon/favicon-16x16.png">
    <title>Cadastrar | Health Track</title>
</head>

<body>

    <div class="login-bg">

        <div class="login-bg-modal">

            <div class="login-bg-modal-image">

                <img src="../assets/images/new/art.svg" alt="Ilustra��o de um homem correndo ao lado de um smartphone com um cora��o na tela." width="100%" height="100%">

            </div>

            <div class="login-bg-modal-form">

                <div class="header">

                    <div class="title">Cadastre-se</div>

                    <span class="text-light">J� possui uma conta? <a href="../index.jsp" class="link">Login</a></span>

                </div>

                <form class="form" action="cadastro" method="post">

                    <div class="item">
                        <label for="nome">Nome completo</label>
                        <input type="text" required>
                    </div>

                    <div class="item">
                        <label for="dataNasc">Data de nascimento</label>
                        <input type="date" required>
                    </div>

                    <div class="item">
                        <label for="email">Email</label>
                        <input type="email" required>
                    </div>

                    <div class="item">
                        <label for="senha">Senha</label>
                        <input type="password" required min="6">
                    </div>

                    <div class="button">

                        <button class="primary">Continuar</button>

                    </div>

                </form>


            </div>

        </div>

    </div>

</body>

</html>