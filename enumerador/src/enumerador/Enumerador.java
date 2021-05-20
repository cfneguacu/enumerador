package enumerador;

public class Enumerador {
	
	public enum NumerosExtenso{
		
	UM(1), 
	DOIS(2), 
	TRES(3),
	QUATRO(4),
	CINCO(5),
	SEIS(6),
	SETE(7),
	OITO(8),
	NOVE(9),
	DEZ(10),
	ONZE(11),
	DOZE(12),
	TREZE(13),
	QUATORZE(14),
	QUINZE(15),
	DEZESSEIS(16),
	DEZESSETE(17),
	DEZOITO(18),
	DEZENOVE(19),
	VINTE(20),
	TRINTA(30),
	QUARENTA(40),
	CINQUENTA(50),
	SESSENTA(60),
	SETENTA(70),
	OITENTA(80),
	NOVENTA(90),
	CEM(100),
	DUZENTOS(200),
	TREZENTOS(300),
	QUATROCENTOS(400),
	QUINHENTOS(500),
	SEISCENTOS(600),
	SETECENTOS(700),
	OITOCENTOS(800),
	NOVECENTOS(900),
	MIL(1000),
	MILHÃO(1000000),
	BILHÃO(1000000000);
	
		
	private final long valor;
		
	NumerosExtenso(long valorOpcao){
		valor = valorOpcao;
	}
	
	public long getValor() {
		return valor;
	}
		
	}

	public static void main(String[] args) {
		
	String teste = "milhão duzentos e quarenta";	// string de teste
	
	String[] extenso;
	
	extenso = teste.split(" ");
	
	long resultado = 0;
	
		for(NumerosExtenso ne : NumerosExtenso.values()){
			
			for(int i = 0 ; i<extenso.length;i++) {
		
				if(ne.toString().equals(extenso[i].toUpperCase())){
			
					resultado = ne.getValor()+resultado;
					
				}
			}
		}
		
		System.out.print(resultado);		
	}
}
