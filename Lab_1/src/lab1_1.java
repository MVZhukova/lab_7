import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class lab1_1 {
	public static void main(String []args) {
		
		int[] numb1 = new int[33];
		int[] numb2 = new int[33];
		
		char[] alph1 = new char[33];
		char[] alph2 = new char[33];
		int c;
		char alphabet[] = {'а', 'б', 'в', 'г', 'д', 'е', 'Є', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', '€','а', 'б'};
		
		ArrayList<String> alphabet2 = new ArrayList<String>();
		alphabet2.add("а");
		alphabet2.add("б");
		alphabet2.add("в");
		alphabet2.add("г");
		alphabet2.add("д");
		alphabet2.add("е");
		alphabet2.add("Є");
		alphabet2.add("ж");
		alphabet2.add("з");
		alphabet2.add("и");
		alphabet2.add("й");
		alphabet2.add("к");
		alphabet2.add("л");
		alphabet2.add("м");
		alphabet2.add("н");
		alphabet2.add("о");
		alphabet2.add("п");
		alphabet2.add("р");
		alphabet2.add("с");
		alphabet2.add("т");
		alphabet2.add("у");
		alphabet2.add("ф");
		alphabet2.add("х");
		alphabet2.add("ц");
		alphabet2.add("ч");
		alphabet2.add("ш");
		alphabet2.add("щ");
		alphabet2.add("ъ");
		alphabet2.add("ы");
		alphabet2.add("ь");
		alphabet2.add("э");
		alphabet2.add("ю");
		alphabet2.add("€");
		
		
		int[] arr_big1 = new int[1089];
		int[] arr_big2 = new int[1089];
		
		String[] bgm1 = new String[20];
		String[] bgm2 = new String[20];
		
		Map<Character, Integer> tabble = new LinkedHashMap<Character, Integer>();
        tabble.put('а', 0);
        tabble.put('б', 0);
        tabble.put('в', 0);
        tabble.put('г', 0);
        tabble.put('д', 0);
        tabble.put('е', 0);
        tabble.put('Є', 0);
        tabble.put('ж', 0);
        tabble.put('з', 0);
        tabble.put('и', 0);
        tabble.put('й', 0);
        tabble.put('к', 0);
        tabble.put('л', 0);
        tabble.put('м', 0);
        tabble.put('н', 0);
        tabble.put('о', 0);
        tabble.put('п', 0);
        tabble.put('р', 0);
        tabble.put('с', 0);
        tabble.put('т', 0);
        tabble.put('у', 0);
        tabble.put('ф', 0);
        tabble.put('х', 0);
        tabble.put('ц', 0);
        tabble.put('ч', 0);
        tabble.put('ш', 0);
        tabble.put('щ', 0);
        tabble.put('ъ', 0);
        tabble.put('ы', 0);
        tabble.put('ь', 0);
        tabble.put('э', 0);
        tabble.put('ю', 0);
        tabble.put('€', 0);
		
        Map<String, Integer> big1 = new LinkedHashMap<String, Integer>();
        bigmap(big1);
        Map<String, Integer> big2 = new LinkedHashMap<String, Integer>();
        bigmap(big2);
        Map<Integer, String> big3 = new LinkedHashMap<Integer, String>();
        
		try(FileReader reader = new FileReader("book.txt"))
        {
            char symb;
            
            while((c=reader.read())!=-1){
            	symb = (char)c;
            	switch (Character.toLowerCase(symb)) {
            	case 'а':
            		tabble.replace('а',tabble.get('а')+1);
            		break;
            	case 'б':
            		tabble.replace('б',tabble.get('б')+1);
            		break;
            	case 'в':
            		tabble.replace('в', tabble.get('в')+1);
            		break;
            	case 'г':
            		tabble.replace('г', tabble.get('г')+1);
            		break;
            	case 'д':
            		tabble.replace('д', tabble.get('д')+1);
            		break;
            	case 'е':
            		tabble.replace('е', tabble.get('е')+1);
            		break;
            	case 'Є':
            		tabble.replace('Є', tabble.get('Є')+1);
            		break;
            	case 'ж':
            		tabble.replace('ж', tabble.get('ж')+1);
            		break;
            	case 'з':
            		tabble.replace('з', tabble.get('з')+1);
            		break;
            	case 'и':
            		tabble.replace('и', tabble.get('и')+1);
            		break;
            	case 'й':
            		tabble.replace('й', tabble.get('й')+1);
            		break;
            	case 'к':
            		tabble.replace('к', tabble.get('к')+1);
            		break;
            	case 'л':
            		tabble.replace('л', tabble.get('л')+1);
            		break;
            	case 'м':
            		tabble.replace('м', tabble.get('м')+1);
            		break;
            	case 'н':
            		tabble.replace('н', tabble.get('н')+1);
            		break;
            	case 'о':
            		tabble.replace('о', tabble.get('о')+1);
            		break;
            	case 'п':
            		tabble.replace('п', tabble.get('п')+1);
            		break;
            	case 'р':
            		tabble.replace('р', tabble.get('р')+1);
            		break;
            	case 'с':
            		tabble.replace('с', tabble.get('с')+1);
            		break;
            	case 'т':
            		tabble.replace('т', tabble.get('т')+1);
            		break;
            	case 'у':
            		tabble.replace('у', tabble.get('у')+1);
            		break;
            	case 'ф':
            		tabble.replace('ф', tabble.get('ф')+1);
            		break;
            	case 'х':
            		tabble.replace('х', tabble.get('х')+1);
            		break;
            	case 'ц':
            		tabble.replace('ц', tabble.get('ц')+1);
            		break;
            	case 'ч':
            		tabble.replace('ч', tabble.get('ч')+1);
            		break;
            	case 'ш':
            		tabble.replace('ш', tabble.get('ш')+1);
            		break;
            	case 'щ':
            		tabble.replace('щ', tabble.get('щ')+1);
            		break;
            	case 'ъ':
            		tabble.replace('ъ', tabble.get('ъ')+1);
            		break;
            	case 'ы':
            		tabble.replace('ы', tabble.get('ы')+1);
            		break;
            	case 'ь':
            		tabble.replace('ь', tabble.get('ь')+1);
            		break;
            	case 'э':
            		tabble.replace('э', tabble.get('э')+1);
            		break;
            	case 'ю':
            		tabble.replace('ю', tabble.get('ю')+1);
            		break;
            	case '€':
            		tabble.replace('€', tabble.get('€')+1);
            		break;
            	default:
            		break;
            	}
            }
            
            for(Map.Entry<Character, Integer> item : tabble.entrySet()){
                
            	System.out.print(item.getKey());
            	System.out.print("=");
            	System.out.print(item.getValue());
            	System.out.print("  ");
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
		
		
		
		try(FileReader reader = new FileReader("chapter.txt");
				FileWriter writer = new FileWriter("code.txt");)
        {
			int x;
			char symb;
			while((x=reader.read())!=-1){
				symb = (char)x;
				for(int i = 0;i<=alphabet.length-3;i++) {
	                if (Character.toLowerCase(symb) == alphabet[i]) {
	                	x = alphabet[i+2];
	                }
	            }
				writer.write(x);
			}
        }
		catch(IOException ex){
            System.out.println(ex.getMessage());
        }
		
		Map<Character, Integer> tabble2 = new LinkedHashMap<Character, Integer>();
        tabble2.put('а', 0);
        tabble2.put('б', 0);
        tabble2.put('в', 0);
        tabble2.put('г', 0);
        tabble2.put('д', 0);
        tabble2.put('е', 0);
        tabble2.put('Є', 0);
        tabble2.put('ж', 0);
        tabble2.put('з', 0);
        tabble2.put('и', 0);
        tabble2.put('й', 0);
        tabble2.put('к', 0);
        tabble2.put('л', 0);
        tabble2.put('м', 0);
        tabble2.put('н', 0);
        tabble2.put('о', 0);
        tabble2.put('п', 0);
        tabble2.put('р', 0);
        tabble2.put('с', 0);
        tabble2.put('т', 0);
        tabble2.put('у', 0);
        tabble2.put('ф', 0);
        tabble2.put('х', 0);
        tabble2.put('ц', 0);
        tabble2.put('ч', 0);
        tabble2.put('ш', 0);
        tabble2.put('щ', 0);
        tabble2.put('ъ', 0);
        tabble2.put('ы', 0);
        tabble2.put('ь', 0);
        tabble2.put('э', 0);
        tabble2.put('ю', 0);
        tabble2.put('€', 0);
		
		try(FileReader reader = new FileReader("code.txt"))
        {
            char symb;
            
            while((c=reader.read())!=-1){
            	symb = (char)c;
            	switch (Character.toLowerCase(symb)) {
            	case 'а':
            		tabble2.replace('а',tabble2.get('а')+1);
            		break;
            	case 'б':
            		tabble2.replace('б',tabble2.get('б')+1);
            		break;
            	case 'в':
            		tabble2.replace('в', tabble2.get('в')+1);
            		break;
            	case 'г':
            		tabble2.replace('г', tabble2.get('г')+1);
            		break;
            	case 'д':
            		tabble2.replace('д', tabble2.get('д')+1);
            		break;
            	case 'е':
            		tabble2.replace('е', tabble2.get('е')+1);
            		break;
            	case 'Є':
            		tabble2.replace('Є', tabble2.get('Є')+1);
            		break;
            	case 'ж':
            		tabble2.replace('ж', tabble2.get('ж')+1);
            		break;
            	case 'з':
            		tabble2.replace('з', tabble2.get('з')+1);
            		break;
            	case 'и':
            		tabble2.replace('и', tabble2.get('и')+1);
            		break;
            	case 'й':
            		tabble2.replace('й', tabble2.get('й')+1);
            		break;
            	case 'к':
            		tabble2.replace('к', tabble2.get('к')+1);
            		break;
            	case 'л':
            		tabble2.replace('л', tabble2.get('л')+1);
            		break;
            	case 'м':
            		tabble2.replace('м', tabble2.get('м')+1);
            		break;
            	case 'н':
            		tabble2.replace('н', tabble2.get('н')+1);
            		break;
            	case 'о':
            		tabble2.replace('о', tabble2.get('о')+1);
            		break;
            	case 'п':
            		tabble2.replace('п', tabble2.get('п')+1);
            		break;
            	case 'р':
            		tabble2.replace('р', tabble2.get('р')+1);
            		break;
            	case 'с':
            		tabble2.replace('с', tabble2.get('с')+1);
            		break;
            	case 'т':
            		tabble2.replace('т', tabble2.get('т')+1);
            		break;
            	case 'у':
            		tabble2.replace('у', tabble2.get('у')+1);
            		break;
            	case 'ф':
            		tabble2.replace('ф', tabble2.get('ф')+1);
            		break;
            	case 'х':
            		tabble2.replace('х', tabble2.get('х')+1);
            		break;
            	case 'ц':
            		tabble2.replace('ц', tabble2.get('ц')+1);
            		break;
            	case 'ч':
            		tabble2.replace('ч', tabble2.get('ч')+1);
            		break;
            	case 'ш':
            		tabble2.replace('ш', tabble2.get('ш')+1);
            		break;
            	case 'щ':
            		tabble2.replace('щ', tabble2.get('щ')+1);
            		break;
            	case 'ъ':
            		tabble2.replace('ъ', tabble2.get('ъ')+1);
            		break;
            	case 'ы':
            		tabble2.replace('ы', tabble2.get('ы')+1);
            		break;
            	case 'ь':
            		tabble2.replace('ь', tabble2.get('ь')+1);
            		break;
            	case 'э':
            		tabble2.replace('э', tabble2.get('э')+1);
            		break;
            	case 'ю':
            		tabble2.replace('ю', tabble2.get('ю')+1);
            		break;
            	case '€':
            		tabble2.replace('€', tabble2.get('€')+1);
            		break;
            	default:
            		break;
            	}
            }
            
            System.out.println("  ");
            for(Map.Entry<Character, Integer> item : tabble2.entrySet()){
            	System.out.print(item.getKey());
            	System.out.print("=");
            	System.out.print(item.getValue());
            	System.out.print("  ");
            }
   
            System.out.println("  ");
            toArray(numb1,tabble);
            System.out.println("  ");
            toArray(numb2,tabble2);
            
            int q;
            char b;
            int z=0;
            
            for(int i = 0;i<numb1.length;i++) {
            	for(Map.Entry<Character, Integer> item : tabble.entrySet()){
                q = item.getValue();
                b = item.getKey();
                	if (q==numb1[i]) {
                		alph1[z]=b;
                		z++;
                	}
            	}
            }
            System.out.println(" ");
            z=0;
            for(int i = 0;i<numb2.length;i++) {
            	for(Map.Entry<Character, Integer> item : tabble2.entrySet()){
                q = item.getValue();
                b = item.getKey();
                	if (q==numb2[i]) {
                		alph2[z]=b;
                		z++;
                	}
            	}
            }
            
            
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
		
		try(FileReader reader = new FileReader("code.txt");
				FileWriter writer = new FileWriter("result.txt");)
        {
			int p;
			int j=0;
			while((p=reader.read())!=-1){
				char symb = (char)p;
				j=0;
				for(int i = 0;i<alph2.length;i++) {
					if (symb==alph2[i]) { 
						writer.write(alph1[i]);
						j=1;
						break;
						}
				}
				if (j==0) writer.write(p);
			}
        }
		catch(IOException ex){
            System.out.println(ex.getMessage());
        }
		
		try(FileReader reader = new FileReader("book.txt"))
        {
			System.out.println("Ѕиграммы всего текста:");
			String bigramm;
			char ch0 = 0; 
			char ch1;
			while((c=reader.read())!=-1) {
				ch1 = Character.toLowerCase((char)c);
				for(int i = 0;i<alphabet.length;i++) {
					if (ch1==alphabet[i]) {
						for(int j = 0;j<alphabet.length;j++) {
							if (ch0==alphabet[j]) {
								bigramm = new String(new char[] {ch0, ch1});
								big1.replace(bigramm, big1.get(bigramm)+1);
								ch0=ch1;
								break;
							}
						}break;
					}
				}
				ch0=ch1;
			}
			
			for(Map.Entry<String, Integer> item : big1.entrySet()){
				if (item.getValue() != 0) {
					System.out.print(item.getKey());
					System.out.print("=");
					System.out.print(item.getValue());
					System.out.println("  ");
				}
            }
			
        }
		catch(IOException ex){
            System.out.println(ex.getMessage());
        }
		
		try(FileReader reader = new FileReader("result.txt"))
        {
			System.out.println("Ѕиграммы зашифрованного текста:");
			String bigramm;
			char ch0 = 0; 
			char ch1;
			while((c=reader.read())!=-1) {
				ch1 = Character.toLowerCase((char)c);
				for(int i = 0;i<alphabet.length;i++) {
					if (ch1==alphabet[i]) {
						for(int j = 0;j<alphabet.length;j++) {
							if (ch0==alphabet[j]) {
								bigramm = new String(new char[] {ch0, ch1});
								big2.replace(bigramm, big2.get(bigramm)+1);
								ch0=ch1;
								break;
							}
						}break;
					}
				}
				ch0=ch1;
			}
			
			for(Map.Entry<String, Integer> item : big2.entrySet()){
				if (item.getValue() != 0) {
					System.out.print(item.getKey());
					System.out.print("=");
					System.out.print(item.getValue());
					System.out.println("  ");
				}
            }
			toArray2(big1,arr_big1);
			toArray2(big2,arr_big2);
			
			int q;
            String b;
            int z=0;
            for(int i = 1088;i>1068;i--) {
            	for(Map.Entry<String, Integer> item : big1.entrySet()){
                q = item.getValue();
                b = item.getKey();
                	if (q==arr_big1[i]) {
                		bgm1[z]=b;
                		System.out.print(b);
                		System.out.print(" ");
                		z++;
                	}
            	}
            }
            System.out.println(" ");
            z=0;
            for(int i = 1088;i>1068;i--) {
            	for(Map.Entry<String, Integer> item : big2.entrySet()){
                q = item.getValue();
                b = item.getKey();
                	if (q==arr_big2[i]) {
                		bgm2[z]=b;
                		System.out.print(b);
                		System.out.print(" ");
                		z++;
                	}
            	}
            }
            
        }
		catch(IOException ex){
            System.out.println(ex.getMessage());
        }
		
		try(FileReader reader = new FileReader("result.txt");
				FileWriter writer = new FileWriter("result_full.txt");)
		{
			String bigramm;
			char ch0 = 0; 
			char ch1;
			int z=0;
			int t,h=0;
			String symb;
			char letter;
			while((c=reader.read())!=-1) {
				ch1 = Character.toLowerCase((char)c);
				bigramm = new String(new char[] {ch0, ch1});
				big3.put(z,bigramm);
				z++;
				ch0=ch1;
			}
			for(Map.Entry<Integer, String> item : big3.entrySet()){
				t=0;
				symb = item.getValue();
				if (h==1) {
				h=0;
				continue;
				}
				for (int i=0;i<bgm2.length;i++) {
					if (symb.equals(bgm2[i])) {
						symb = bgm1[i];
						writer.write(symb);
						t=1;
						h=1;
					}
				}
				if (t==0) {
				letter = symb.charAt(0);
				writer.write(letter);
				}
			}
			
        }
		catch(IOException ex){
            System.out.println(ex.getMessage());
        }
		
    }
	
	static void toArray(int arr[], Map<Character, Integer> map) {
        int index = 0;
        for(Map.Entry<Character, Integer> item : map.entrySet()){
            arr[index] = item.getValue();
            index++;
        }
        Arrays.sort(arr);
    }
	
	static void toArray2( Map<String, Integer> map,int arr[]) {
        int index = 0,new_arr[],k = 1088;
        new_arr = new int[10];
        for(Entry<String, Integer> item : map.entrySet()){
            arr[index] = item.getValue();
            index++;
        }
        Arrays.sort(arr);
        for(int i = 0;i<10;i++) {
            new_arr[i] = arr[k];
            k--;
        }
        arr = new_arr;
    }
	static void bigmap (Map<String, Integer> map) {
		for(char ch0 = 'а'; ch0 <= '€'; ch0++) {
			for(char ch1 = 'а'; ch1 <= '€'; ch1++) {
				String bigramm = new String(new char[] {ch0, ch1});
				map.put(bigramm, 0);
			}
		}
		for(char ch0 = 'а'; ch0 <= '€'; ch0++) {
			String bigramm = new String(new char[] {'Є', ch0});
			map.put(bigramm, 0);
		}
		for(char ch1 = 'а'; ch1 <= '€'; ch1++) {
			String bigramm = new String(new char[] {ch1, 'Є'});
			map.put(bigramm, 0);
		}
		String bigramm = new String(new char[] {'Є', 'Є'});
		map.put(bigramm, 0);	
	}
	
}

