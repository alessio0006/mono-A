
// TODO Inserire il package corretto
package it.marconicivitavecchia.as2018_19.c5Binf.verifica ;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Project X");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe
		super.setSize(300,200);
		
		// TODO Usare StringBuilder per costruire la stringa HTML
		StringBuilder sb=new StringBuilder();
		
		// TODO Creare la stringa HTML per il wireframe
		sb.append("<html>");
	    sb.append("<div style='display:table'>");
        sb.append("div style='display:table-row'>");
        sb.append("<h1>Almanacco Astronomico </h>");
        sb.append("</div");
        sb.append("<div style='display:table-row'>");
        sb.append("<h3> Novembre 2018 <h3>");
        sb.append("</div>");
        sb.append("</div>");
		sb.append("</html>");
		// TODO Convertire lo StringBuilder in String
		String htmlText;
		htmlText=sb.toString();
		// TODO Assegnare correttamente la stringa create a JLabel
		super.add(new JLabel(htmlText));
		super.setVisible(true);
		 
		System.out.println(htmlText);
		
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

