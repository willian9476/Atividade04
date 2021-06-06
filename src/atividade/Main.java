package atividade;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

        Gerente gerente = new Gerente(35,"José Bonifácio","11122233345","Gerente Regional",5525.50, 0.15,"Norte-Nordeste",0); //Criando gerente
        Vendedor vendedor = new Vendedor(25,"Mauro Jorge","66677788890","Vendedor Interno", 1550.50, gerente,0,0.05,0);//Criando vendedor
        Vendedor vendedor2 = new Vendedor(25,"Pedro Barros","12345678910","Vendedor Externo", 1550.50, gerente,0,0.05,0);//Criando outro vendedor

        List<Vendas> vendas = new ArrayList<>();
        List<Vendas> vendas02 = new ArrayList<>();
        List<Vendedor> vendedores = new ArrayList<>();

        
        vendedores.add(vendedor);
        vendedores.add(vendedor2);

        
        gerente.setVendedores(vendedores);

        
        Vendas vendas1 = new Vendas(500);
        Vendas vendas2 = new Vendas(650);
        Vendas vendas3 = new Vendas(725);
        Vendas vendas4 = new Vendas(400);
        Vendas vendas5 = new Vendas(300);
        Vendas vendas6 = new Vendas(1000);
        Vendas vendas7 = new Vendas(800);
        Vendas vendas8 = new Vendas(725);
        Vendas vendas9 = new Vendas(900);
        Vendas vendas10 = new Vendas(999);

       
        vendas.add(vendas1);
        vendas.add(vendas2);
        vendas.add(vendas3);
        vendas.add(vendas4);
        vendas.add(vendas5);

        
        vendas02.add(vendas6);
        vendas02.add(vendas7);
        vendas02.add(vendas8);
        vendas02.add(vendas9);
        vendas02.add(vendas10);

        vendedor.setVendas(vendas);

        vendedor2.setVendas(vendas02);

        vendedor.getTotalVendas();
        vendedor.getTotalComissao();

        vendedor2.getTotalVendas();
        vendedor2.getTotalComissao();

        gerente.getComissaoTotalGerente();

        System.out.println();
        System.out.println(vendedor.getNome()+" "+vendedor.getVendas()+ " " + vendedor.getSalario());
        System.out.println();
        System.out.println(vendedor2.getNome()+" "+vendedor2.getVendas()+ " " + vendedor2.getSalario());
        System.out.println();
        System.out.println(gerente.getNome()+" "+gerente.getSalario());

    }

}
