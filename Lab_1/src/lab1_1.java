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
		char alphabet[] = {'�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�','�', '�'};
		
		ArrayList<String> alphabet2 = new ArrayList<String>();
		alphabet2.add("�");
		alphabet2.add("�");
		alphabet2.add("�");
		alphabet2.add("�");
		alphabet2.add("�");
		alphabet2.add("�");
		alphabet2.add("�");
		alphabet2.add("�");
		alphabet2.add("�");
		alphabet2.add("�");
		alphabet2.add("�");
		alphabet2.add("�");
		alphabet2.add("�");
		alphabet2.add("�");
		alphabet2.add("�");
		alphabet2.add("�");
		alphabet2.add("�");
		alphabet2.add("�");
		alphabet2.add("�");
		alphabet2.add("�");
		alphabet2.add("�");
		alphabet2.add("�");
		alphabet2.add("�");
		alphabet2.add("�");
		alphabet2.add("�");
		alphabet2.add("�");
		alphabet2.add("�");
		alphabet2.add("�");
		alphabet2.add("�");
		alphabet2.add("�");
		alphabet2.add("�");
		alphabet2.add("�");
		alphabet2.add("�");
		
		
		int[] arr_big1 = new int[1089];
		int[] arr_big2 = new int[1089];
		
		String[] bgm1 = new String[20];
		String[] bgm2 = new String[20];
		
		Map<Character, Integer> tabble = new LinkedHashMap<Character, Integer>();
        tabble.put('�', 0);
        tabble.put('�', 0);
        tabble.put('�', 0);
        tabble.put('�', 0);
        tabble.put('�', 0);
        tabble.put('�', 0);
        tabble.put('�', 0);
        tabble.put('�', 0);
        tabble.put('�', 0);
        tabble.put('�', 0);
        tabble.put('�', 0);
        tabble.put('�', 0);
        tabble.put('�', 0);
        tabble.put('�', 0);
        tabble.put('�', 0);
        tabble.put('�', 0);
        tabble.put('�', 0);
        tabble.put('�', 0);
        tabble.put('�', 0);
        tabble.put('�', 0);
        tabble.put('�', 0);
        tabble.put('�', 0);
        tabble.put('�', 0);
        tabble.put('�', 0);
        tabble.put('�', 0);
        tabble.put('�', 0);
        tabble.put('�', 0);
        tabble.put('�', 0);
        tabble.put('�', 0);
        tabble.put('�', 0);
        tabble.put('�', 0);
        tabble.put('�', 0);
        tabble.put('�', 0);
		
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
            	case '�':
            		tabble.replace('�',tabble.get('�')+1);
            		break;
            	case '�':
            		tabble.replace('�',tabble.get('�')+1);
            		break;
            	case '�':
            		tabble.replace('�', tabble.get('�')+1);
            		break;
            	case '�':
            		tabble.replace('�', tabble.get('�')+1);
            		break;
            	case '�':
            		tabble.replace('�', tabble.get('�')+1);
            		break;
            	case '�':
            		tabble.replace('�', tabble.get('�')+1);
            		break;
            	case '�':
            		tabble.replace('�', tabble.get('�')+1);
            		break;
            	case '�':
            		tabble.replace('�', tabble.get('�')+1);
            		break;
            	case '�':
            		tabble.replace('�', tabble.get('�')+1);
            		break;
            	case '�':
            		tabble.replace('�', tabble.get('�')+1);
            		break;
            	case '�':
            		tabble.replace('�', tabble.get('�')+1);
            		break;
            	case '�':
            		tabble.replace('�', tabble.get('�')+1);
            		break;
            	case '�':
            		tabble.replace('�', tabble.get('�')+1);
            		break;
            	case '�':
            		tabble.replace('�', tabble.get('�')+1);
            		break;
            	case '�':
            		tabble.replace('�', tabble.get('�')+1);
            		break;
            	case '�':
            		tabble.replace('�', tabble.get('�')+1);
            		break;
            	case '�':
            		tabble.replace('�', tabble.get('�')+1);
            		break;
            	case '�':
            		tabble.replace('�', tabble.get('�')+1);
            		break;
            	case '�':
            		tabble.replace('�', tabble.get('�')+1);
            		break;
            	case '�':
            		tabble.replace('�', tabble.get('�')+1);
            		break;
            	case '�':
            		tabble.replace('�', tabble.get('�')+1);
            		break;
            	case '�':
            		tabble.replace('�', tabble.get('�')+1);
            		break;
            	case '�':
            		tabble.replace('�', tabble.get('�')+1);
            		break;
            	case '�':
            		tabble.replace('�', tabble.get('�')+1);
            		break;
            	case '�':
            		tabble.replace('�', tabble.get('�')+1);
            		break;
            	case '�':
            		tabble.replace('�', tabble.get('�')+1);
            		break;
            	case '�':
            		tabble.replace('�', tabble.get('�')+1);
            		break;
            	case '�':
            		tabble.replace('�', tabble.get('�')+1);
            		break;
            	case '�':
            		tabble.replace('�', tabble.get('�')+1);
            		break;
            	case '�':
            		tabble.replace('�', tabble.get('�')+1);
            		break;
            	case '�':
            		tabble.replace('�', tabble.get('�')+1);
            		break;
            	case '�':
            		tabble.replace('�', tabble.get('�')+1);
            		break;
            	case '�':
            		tabble.replace('�', tabble.get('�')+1);
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
        tabble2.put('�', 0);
        tabble2.put('�', 0);
        tabble2.put('�', 0);
        tabble2.put('�', 0);
        tabble2.put('�', 0);
        tabble2.put('�', 0);
        tabble2.put('�', 0);
        tabble2.put('�', 0);
        tabble2.put('�', 0);
        tabble2.put('�', 0);
        tabble2.put('�', 0);
        tabble2.put('�', 0);
        tabble2.put('�', 0);
        tabble2.put('�', 0);
        tabble2.put('�', 0);
        tabble2.put('�', 0);
        tabble2.put('�', 0);
        tabble2.put('�', 0);
        tabble2.put('�', 0);
        tabble2.put('�', 0);
        tabble2.put('�', 0);
        tabble2.put('�', 0);
        tabble2.put('�', 0);
        tabble2.put('�', 0);
        tabble2.put('�', 0);
        tabble2.put('�', 0);
        tabble2.put('�', 0);
        tabble2.put('�', 0);
        tabble2.put('�', 0);
        tabble2.put('�', 0);
        tabble2.put('�', 0);
        tabble2.put('�', 0);
        tabble2.put('�', 0);
		
		try(FileReader reader = new FileReader("code.txt"))
        {
            char symb;
            
            while((c=reader.read())!=-1){
            	symb = (char)c;
            	switch (Character.toLowerCase(symb)) {
            	case '�':
            		tabble2.replace('�',tabble2.get('�')+1);
            		break;
            	case '�':
            		tabble2.replace('�',tabble2.get('�')+1);
            		break;
            	case '�':
            		tabble2.replace('�', tabble2.get('�')+1);
            		break;
            	case '�':
            		tabble2.replace('�', tabble2.get('�')+1);
            		break;
            	case '�':
            		tabble2.replace('�', tabble2.get('�')+1);
            		break;
            	case '�':
            		tabble2.replace('�', tabble2.get('�')+1);
            		break;
            	case '�':
            		tabble2.replace('�', tabble2.get('�')+1);
            		break;
            	case '�':
            		tabble2.replace('�', tabble2.get('�')+1);
            		break;
            	case '�':
            		tabble2.replace('�', tabble2.get('�')+1);
            		break;
            	case '�':
            		tabble2.replace('�', tabble2.get('�')+1);
            		break;
            	case '�':
            		tabble2.replace('�', tabble2.get('�')+1);
            		break;
            	case '�':
            		tabble2.replace('�', tabble2.get('�')+1);
            		break;
            	case '�':
            		tabble2.replace('�', tabble2.get('�')+1);
            		break;
            	case '�':
            		tabble2.replace('�', tabble2.get('�')+1);
            		break;
            	case '�':
            		tabble2.replace('�', tabble2.get('�')+1);
            		break;
            	case '�':
            		tabble2.replace('�', tabble2.get('�')+1);
            		break;
            	case '�':
            		tabble2.replace('�', tabble2.get('�')+1);
            		break;
            	case '�':
            		tabble2.replace('�', tabble2.get('�')+1);
            		break;
            	case '�':
            		tabble2.replace('�', tabble2.get('�')+1);
            		break;
            	case '�':
            		tabble2.replace('�', tabble2.get('�')+1);
            		break;
            	case '�':
            		tabble2.replace('�', tabble2.get('�')+1);
            		break;
            	case '�':
            		tabble2.replace('�', tabble2.get('�')+1);
            		break;
            	case '�':
            		tabble2.replace('�', tabble2.get('�')+1);
            		break;
            	case '�':
            		tabble2.replace('�', tabble2.get('�')+1);
            		break;
            	case '�':
            		tabble2.replace('�', tabble2.get('�')+1);
            		break;
            	case '�':
            		tabble2.replace('�', tabble2.get('�')+1);
            		break;
            	case '�':
            		tabble2.replace('�', tabble2.get('�')+1);
            		break;
            	case '�':
            		tabble2.replace('�', tabble2.get('�')+1);
            		break;
            	case '�':
            		tabble2.replace('�', tabble2.get('�')+1);
            		break;
            	case '�':
            		tabble2.replace('�', tabble2.get('�')+1);
            		break;
            	case '�':
            		tabble2.replace('�', tabble2.get('�')+1);
            		break;
            	case '�':
            		tabble2.replace('�', tabble2.get('�')+1);
            		break;
            	case '�':
            		tabble2.replace('�', tabble2.get('�')+1);
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
			System.out.println("�������� ����� ������:");
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
			System.out.println("�������� �������������� ������:");
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
		for(char ch0 = '�'; ch0 <= '�'; ch0++) {
			for(char ch1 = '�'; ch1 <= '�'; ch1++) {
				String bigramm = new String(new char[] {ch0, ch1});
				map.put(bigramm, 0);
			}
		}
		for(char ch0 = '�'; ch0 <= '�'; ch0++) {
			String bigramm = new String(new char[] {'�', ch0});
			map.put(bigramm, 0);
		}
		for(char ch1 = '�'; ch1 <= '�'; ch1++) {
			String bigramm = new String(new char[] {ch1, '�'});
			map.put(bigramm, 0);
		}
		String bigramm = new String(new char[] {'�', '�'});
		map.put(bigramm, 0);	
	}
	
}

