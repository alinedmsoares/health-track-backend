<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="ISO-8859-1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/style.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.2/Chart.min.js"></script>
    <link rel="apple-touch-icon" sizes="180x180" href="/favicon/apple-touch-icon.png">
    <link rel="icon" type="image/png" sizes="32x32" href="/favicon/favicon-32x32.png">
    <link rel="icon" type="image/png" sizes="16x16" href="/favicon/favicon-16x16.png">
    <title>Dashboard | Health Track</title>
</head>

<body>

    <nav role="navigation" class="menu-mobile">
        <div id="menuToggle">

            <input type="checkbox" />
            <span></span>
            <span></span>
            <span></span>

            <ul id="menu">
                <li><a href="dashboard.html">Dashboard</a></li>
                <li>
                    <a href="../pesos/pesos.html">Pesos</a>
                </li>
                <li>
                    <a href="../pressoes/pressoes.html">Press�o arterial</a>
                </li>
                <li>
                    <a href="../alimentos/alimentos.html">Alimenta��o</a>
                </li>
                <li>
                    <a href="../atividades/atividades.html">Atividades</a>
                </li>
            </ul>
        </div>
    </nav>

    <div class="menu">

        <ul>
            <li><a href="dashboard.html" class="selected">Dashboard</a></li>
            <li>
                <a href="../pesos/pesos.html">Pesos</a>
            </li>
            <li>
                <a href="../pressoes/pressoes.html">Press�o arterial</a>
            </li>
            <li>
                <a href="../alimentos/alimentos.html">Alimenta��o</a>
            </li>
            <li>
                <a href="../atividades/atividades.html">Atividades</a>
            </li>
        </ul>

        <button><a href="index.html">Sair</a></button>
    </div>

    <div class="dashboard-header">

        <div class="text">

            <div class="title">Ol�, ${nomeUsuario}</div>
            <div class="subtitle">${idade} anos</div>

        </div>

        <div class="foto" onclick="perfil()"></div>

    </div>

    <div class="main dashboard">


        <div class="dashboard-charts">

            <div class="card-chart" id="weight">
                <h2 class="chart-title">Peso</h2>
                <canvas id="chLine"> </canvas>
            </div>

            <div class="card-chart" id="food">
                <h2 class="chart-title">Alimenta��o</h2>
                <canvas id="chBar"> </canvas>
            </div>

        </div>

        <div class="dashboard-list">

            <div class="card">

                <div class="date">${hoje}</div>

                <div class="info">

                    <div class="icon weight"></div>
                    <div class="data">${imc}</div>

                </div>

                <div class="description">${imcStatus}</div>

            </div>

            <div class="card">

                <div class="date">${hoje}</div>

                <div class="info">

                    <div class="icon pressure"></div>
                    <div class="data">${sistolica}/${diastolica}</div>

                </div>

                <div class="description">${pressaoStatus}</div>

            </div>

            <div class="card">

                <div class="date">${hoje}</div>

                <div class="info">

                    <div class="icon height"></div>
                    <div class="data">${altura}m</div>

                </div>

                <div class="description">Altura</div>

            </div>

        </div>

    </div>

</body>

</html>

<script src="${pageContext.request.contextPath}/dashboard/script.js"></script>