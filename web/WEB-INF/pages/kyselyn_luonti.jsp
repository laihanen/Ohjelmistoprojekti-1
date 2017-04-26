<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Kyselyn luonti</title>
    <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700" rel="stylesheet">
    <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
    <link href="<c:url value="/resources/css/hamburgers.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/styles.css" />" rel="stylesheet">
</head>
<body>
<div class="container-fluid" id="container">
<div class="row">
        <div class="col-md-3 offset-md-1" id="column-1">
            <nav class="" id="nav">
                <div id="nav-button" class="hamburger hamburger--collapse">
                    <div class="hamburger-box">
                        <div class="hamburger-inner"></div>
                    </div>
                </div>
                <ul class="hidden">
                    <li><a href="#">Luo uusi</a></li>
                    <li><a href="#">Valmiit kyselyt</a></li>
                    <li><a href="#">Tulokset</a></li>
                    <li><a>FI / SWE</a></li>
                    <li><a href="#">Kirjaudu ulos</a></li>
                </ul>
            </nav>
            <ul id="menu">
                <li data-menuanchor="firstPage" class="active"><a href="#firstPage">Perustiedot</a></li>
                <li data-menuanchor="secondPage"><a href="#secondPage">Kysymykset</a></li>
                <li data-menuanchor="thirdPage"><a href="#thirdPage">Yhteenveto</a></li>
            </ul>
        </div>
        <div class="col-md-5" id="fullpage">
            <div class="section active" id="section0">
                <div class="content">
                    <form>
                        <div class="pseudo-table">
                            <input id="q-header" class="simplebox" type="text"/>
                            <label for="q-header">Nimi:</label>
                        </div>
                        <div class="pseudo-table">
                            <input id="q-desc" class="simplebox" type="text"/>
                            <label for="q-desc">Kuvaus:</label>
                        </div>
                    </form>
                </div>
                <span class="active-line"></span>
            </div>
            <div class="section" id="section1">
                <p>2</p>
            </div>
            <div class="section" id="section2">
                <p>3</p>
            </div>
        </div>
        <div class="col-md-2 offset-md-1" id="lang">
            <!-- <img src="img/hh_tunnus.png" /> -->
        </div>
    </div>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
<script src="<c:url value="/resources/js/scrolloverflow.min.js" />"></script>
<script src="<c:url value="/resources/js/jquery.fullPage.min.js" />"></script>
<script>
    $(document).ready(function() {
        $('#fullpage').fullpage({
            anchors: ['firstPage', 'secondPage', 'thirdPage'],
            scrollOverflow: true,
            menu: '#menu'
        });
    });
    $('.hamburger').click(function() {
        $('.hamburger').toggleClass('is-active');
        $('#nav ul').toggle( "fast" );
        $('#menu').toggle( "fade", "fast" );
    });
</script>
</body>
</html>
