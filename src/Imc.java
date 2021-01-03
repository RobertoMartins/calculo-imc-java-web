

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Imc
 */
@WebServlet("/Imc")
public class Imc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Imc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		float indice;
		float altura;
		float peso;
		
		String result;
		
		altura=Float.parseFloat(request.getParameter("altura"));
		peso=Float.parseFloat(request.getParameter("peso"));
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		indice=peso/(altura*altura);
		
		if(indice<1){
	        result="<b>Resultado:</b> índice não reconhecido. "+
	        		"Verifique o seu peso e altura e tente novamente. ";
	    }else if(indice<17){
	        result="<b>Resultado:</b> O seu índice é <strong>"+df.format(indice)+
	        "</strong>. VOCÊ ESTÁ MUITO ABAIXO DO PESO.";
	    }else if(indice<18.5){
	         result="<b>Resultado:</b> O seu índice é <strong>"+df.format(indice)+
	        "</strong>. VOCÊ ESTÁ ABAIXO DO PESO";
	    }else if(indice<24.9){
	        result="<b>Resultado:</b> O seu índice é <strong>"+df.format(indice)+
	        "</strong>. VOCÊ ESTÁ COM PESO IDEAL.";
	    
	    }else if(indice<29.9){
	        result="<b>Resultado:</b> O seu índice é <strong>"+df.format(indice)+
	        "</strong>. VOCÊ ESTÁ COM SOBREPESO.";

	    }else if(indice<39.9){
	        result="<b>Resultado:</b> O seu índice é <strong>"+df.format(indice)+
	        "</strong>. VOCÊ ESTÁ COM OBESIDADE.";
	    }else if(indice>40){
	        result="<b>Resultado:</b> O seu índice é <strong>"+df.format(indice)+
	        "</strong>. VOCÊ ESTÁ COM OBESIDADE GRAVE.";
	    }else{
	        result="<b>Resultado:</b> índice não reconhecido. "+
	        "Verifique o seu peso e altura e tente novamente. ";
	    }
		
		//covertendo a string do resultado para UTF-8
		byte array[] = result.getBytes("UTF-8");
		String r = new String(array,"ISO-8859-1");
		
		
		
		try(PrintWriter out = response.getWriter()){
			out.println("<!DOCTYPE html>\r\n"
					+ "<html lang=\"pt-br\">\r\n"
					+ "<head>\r\n"
					+ "    <meta charset=\"UTF-8\">\r\n"
					+ "    <title>Calculo IMC</title>\r\n"
					+ "    <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/estilo.css\" media=\"screen\" />\r\n"
					+ "    <link href=\"https://fonts.googleapis.com/css2?family=Archivo:wght@400;700&family=Poppins&display=swap\"rel=\"stylesheet\">\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "    <script src=\"scripts/calculo.js\"></script>\r\n"
					+ "    <div id=\"container\">\r\n"
					+ "        <header>Calcule seu IMC aqui !</header>\r\n"
					+ "        <main>\r\n"
					+ "            <form action=\"Imc\">\r\n"
					+ "                <div class=\"inputs\">\r\n"
					+ "                    <strong>Altura (m): </strong>\r\n"
					+ "                    <input type=\"text\" id=\"altura\" name=\"altura\" placeholder=\"(ex.: 1.70) \">\r\n"
					+ "                </div>\r\n"
					+ "                <div class=\"inputs\">\r\n"
					+ "                    <strong>Peso (kg): </strong>\r\n"
					+ "                    <input type=\"text\" id=\"peso\" name=\"peso\" placeholder=\"(ex.: 77.5) \">\r\n"
					+ "                </div>\r\n"
					+ "                <input type=\"submit\"id=\"calcular\" value=\"Calcular\">\r\n"
					+ "               \r\n"
					+ "            </form>\r\n"
					+ "            \r\n"
					+ "        </main>\r\n"
					+ "        <footer>\r\n"
					+ "            <p id=\"result\">"+r+"</p>\r\n"
					+ "        </footer>\r\n"
					+ "    </div>\r\n"
					+ "</body>\r\n"
					+ "</html>");
		}
		
	}

}
