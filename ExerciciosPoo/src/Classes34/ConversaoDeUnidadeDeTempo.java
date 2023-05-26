package Classes34;

public class ConversaoDeUnidadeDeTempo {
		
	
		//Métodos de conversão de tempo
		public static int minutoParaSegundos(int tempo) {
			return tempo * 60;
		}
		public static int horaParaMinutos(int tempo) {
			return tempo * 60;
		}
		public static int diaParaHoras(int tempo) {
			return tempo * 24;
		}
		public static int semanaParaDias(int tempo) {
			return tempo * 7;
		}
		public static int mesParaDias(int tempo) {
			return tempo * 30;
		}
		public static int anoParaDias(int tempo) {
			return tempo * 365;
		}
		//Métodos auxiliares
		public static int conversao1(int tempo) {
			return ConversaoDeUnidadeDeTempo.minutoParaSegundos(tempo);
		}
		public static int conversao2(int tempo) {
			return ConversaoDeUnidadeDeTempo.horaParaMinutos(tempo);
		}
		public static int conversao3(int tempo) {
			return ConversaoDeUnidadeDeTempo.diaParaHoras(tempo);
		}
		public static int conversao4(int tempo) {
			return ConversaoDeUnidadeDeTempo.semanaParaDias(tempo);
		}
		public static int conversao5(int tempo) {
			return ConversaoDeUnidadeDeTempo.mesParaDias(tempo);
		}
		public static int conversao6(int tempo) {
			return ConversaoDeUnidadeDeTempo.anoParaDias(tempo);
		}
		
}		


