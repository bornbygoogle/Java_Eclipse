<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
  <head>
    <meta http-equiv="content-type" content="application/xhtml+xml; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, maximum-scale=1">
    <link rel="stylesheet" type="text/css" href="style.css">
    <title>bornbygoogle app world</title>
  </head>

  <body>
    <h1>Hello App Engine!</h1>
    
    <div id="panel-gauche">
       <h2>Avaible Servlets</h2>
       <form method="POST" action="choice">
          <select name="choix" onchange="this.form.submit();" >
             <option value="">Choisir un sujet</option>
             <option value="00">Calculatrice</option>
             <option value="01">Menagerie</option>
          </select>
       </form>

    </div>
    <div id="panel-droite">
       <h3><i><u>Sujet : </u></i></h3>
       <% if (request.getAttribute("choix")==null)request.setAttribute("choix","intro"); %>
       <% String numSujet = "/WEB-INF/sujet/" + (String)request.getAttribute("choix") + ".html"; %>
       <jsp:include page='<%=numSujet %>' />
    </div>
    
    <!-- table>
      <tr>
        <td colspan="2" style="font-weight:bold;">Available Servlets:</td>        
      </tr>
      <tr>
        <td><a href='/hello'>The servlet</a></td>
      </tr>
    </table-->
  </body>
</html>