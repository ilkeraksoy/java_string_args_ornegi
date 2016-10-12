public class Ornek {
	public static void main(String[] args) {		
		String sifre="sifre";
		if(sifre.equals(args[0])){
			System.out.println("Giriş başarılı...");
		}
		else{
			System.out.println("Hatalı şifre!");
		}
	}

}