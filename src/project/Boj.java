package project;

import java.io.*;
import java.util.*;

public class Boj{
	//===============================================================
	// 2020-09-28 (월)
    //===============================================================
	public void q10870() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		System.out.println(pibo(n));
	}
	public int pibo(int n){
		if (n<=1)  return n;
		return pibo(n-2)+pibo(n-1);
	}
		
		
	public void q10872() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		System.out.println(factorial(n));
	}
	public int factorial(int n){
		if (n<=1)  return 1;
		return n * factorial(n-1);
	}
		
	
	public void q1002() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int R = Integer.parseInt(br.readLine());
		System.out.printf("%.6f\n", (double) R * R * 3.1415926535897932384626433);
		System.out.printf("%.6f\n", (double) 2 * R * R);
	}	
		
	public void q4153() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		StringTokenizer st = new StringTokenizer(str);
		int x  = Integer.parseInt(st.nextToken());
		int y  = Integer.parseInt(st.nextToken());
		int z  = Integer.parseInt(st.nextToken());

		while(!( x == 0 && y == 0 && z == 0)){

		  boolean flag = false; 

		  if(((x*x) + (y*y)) == z*z){
			flag = true; 

		  }else if(((y*y) + (z*z)) == x*x){
			flag = true; 

		  }else if(((z*z) + (x*x)) == y*y){
			flag = true; 
		  }      

		  if(flag){
			System.out.println("right");
		  }else{
			System.out.println("wrong");
		  }

		  str = br.readLine();
		  st = new StringTokenizer(str);
			x  = Integer.parseInt(st.nextToken());
			y  = Integer.parseInt(st.nextToken());
			z  = Integer.parseInt(st.nextToken());
		}
	}
		
		
	public void q3009() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] x = new int[3];
		int[] y = new int[3];
		int resultX = 0;
		int resultY = 0;

		for(int i=0; i<3; i++){
			String str = br.readLine();

			StringTokenizer st = new StringTokenizer(str);
			x[i]  = Integer.parseInt(st.nextToken());
			y[i]  = Integer.parseInt(st.nextToken());

		}

		if(x[0] != x[1]){
		  if(x[0] == x[2]){
			resultX = x[1];
		  }else{
			resultX = x[0];
		  }
		}else{
		  resultX = x[2];
		}


		if(y[0] != y[1]){
		  if(y[0] == y[2]){
			resultY = y[1];
		  }else{
			resultY = y[0];
		  }
		}else{
		  resultY = y[2];
		}

		System.out.println(resultX+" "+resultY);
	}
	
	public void q1085() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str);
		int x     = Integer.parseInt(st.nextToken());
		int y     = Integer.parseInt(st.nextToken());
		int w     = Integer.parseInt(st.nextToken());
		int h     = Integer.parseInt(st.nextToken());
		
		
		System.out.println(Math.min(Math.min(w-x,x) , Math.min(h-y,y)));
	}
		
	public void q9020() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
		boolean[] prime = new boolean[10000+1]; // true:소수아님, false:소수 
		prime[0] = prime[1] = true; 

		for (int i=2; i<=Math.sqrt(prime.length); i++) {
				if (prime[i]) continue;

				for (int j= i*i; j<prime.length; j+=i) {
					prime[j] = true;
				}
			}


		int cnt = Integer.parseInt(br.readLine());

		for(int i=0; i<cnt; i++){
		  int n = Integer.parseInt(br.readLine());

		  int p = n/2;
		  int q = n/2; 

		  while(q > 0){

			if(prime[p] == false && prime[q] == false){
			  System.out.println(p+" "+q);
			  break;
			}

			p--;
			q++;

		  }
		}
	}
	
	public void q4948() throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
		int n = Integer.parseInt(br.readLine());

		while(n != 0){

		  int cnt = 0; 
		  for(int i=n+1; i<=n*2; i++){
			boolean flag = true; 
			if(i == 1){
			  flag = false;
			}

			int len = (int)Math.sqrt(i)+1;
			for(int j=2; j<len; j++){
			  if(i%j == 0){
				flag = false;
				break;
			  }
			}
			if(flag){
			  cnt++; 
			}
		  }

		  System.out.println(cnt);

		  n = Integer.parseInt(br.readLine());  
		}
		
	}
		
		
	//===============================================================
	// 2020-09-25 (금)
    //===============================================================
	public void q1929() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		int m     = Integer.parseInt(st.nextToken());
		int n     = Integer.parseInt(st.nextToken());

		for(int i=m; i<=n; i++){
		  boolean flag = true; 
		  int num = i; 
		  if(num == 1){
			flag = false;
		  }

		  int len = (int)Math.sqrt(num)+1;
		  for(int j=2; j<len; j++){
			if(num%j == 0){
			  flag = false;
			  break;
			}
		  }
		  if(flag){
			System.out.println(num);
		  }
		}
	}
	
		
		
	
	public void q2581() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());

		int sum =0;
		int min =10000;

		for(int i=m; i<n; i++){
		  boolean flag = true; 
		  int num = i; 
		  if(num == 1){
			flag = false;
		  }

		  for(int j=2; j<num; j++){
			if(num%j == 0){
			  flag = false;
			  break;
			}
		  }
		  if(flag){
			sum+= num;
			if(min>num) min = num; 
		  }
		}

		if(sum == 0){
		  System.out.println(-1);  
		}else{

		  System.out.println(sum);
		  System.out.println(min);
		}
		
	}
	
	public void q1978() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int cnt = 0; 

		for(int i=0; i<str.length; i++){
		  int num = Integer.parseInt(str[i]);
		  if(num == 1){
			cnt++;
		  }
		  for(int j=2; j<num; j++){
			if(num%j == 0){
			  cnt++;
			  break; 
			}
		  }
		}

		System.out.println(n-cnt);

	}
	
	
	//===============================================================
	// 2020-09-24 (목)
    //===============================================================
	
	public void q2775() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
		int n = Integer.parseInt(br.readLine());

		for(int m=0; m<n; m++){
		  int ch = Integer.parseInt(br.readLine());
		  int ho = Integer.parseInt(br.readLine());

		  int[][] apt = new int[ch+1][ho+1];

		  for(int i=0; i<=ch; i++){
			for(int j=0; j<=ho; j++){
			  if(i==0){
				apt[0][j]= j+1;
			  }else{
				for(int k=0; k<=j; k++){
				  apt[i][j] += apt[i-1][k];
				}
			  }
			  //System.out.println("apt["+i+"]["+j+"] : "+apt[i][j]);
			}
		  }

		  System.out.println(apt[ch][ho-1]);
		}
	}
		
	public void q2869() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		StringTokenizer st = new StringTokenizer(str);
		int up     = Integer.parseInt(st.nextToken());
		int down   = Integer.parseInt(st.nextToken());
		int length = Integer.parseInt(st.nextToken());


		int day = (length - down) / (up - down);
			if ((length - down) % (up - down) != 0)
				day++;


		System.out.println(day);
	}
		
	
	public void q1193() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
		int n = Integer.parseInt(br.readLine());

		int sum = 0; //이전 갯수 합 
		int cnt = 1; //대각선 갯수 
		String result ="";

		while(true){

		  if(n <= (sum+cnt)){

			if(cnt%2 == 0){
			  result = (n-sum) +"/" + (cnt - (n-sum-1)) ;
			  break; 
			}else{
			  result = (cnt - (n-sum-1)) +"/" + (n-sum) ;
			  break; 
			}

		  }else{
			sum += cnt; 
			cnt ++;
		  }

		}

		System.out.println(result);
	}
		
		
	//===============================================================
	// 2020-09-22 (화)
    //===============================================================
	public void q2292() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
		int n = Integer.parseInt(br.readLine());

		int cnt =1;
		int num =1;
		while(n > num){
		  num += (6*cnt);
		  cnt ++;
		}

		System.out.println(cnt);
	}
	
	public void q2839() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
		int n = Integer.parseInt(br.readLine());
		
		int result = -1;
    
		int fiveCnt = n/5;

		for(int i=fiveCnt; i>=0; i-- ){
		  int temp = n -(i*5);  
		  if(temp > 0 && temp%3 == 0){
			result = i + temp/3;
			break; 
		  }
		}
		
		System.out.println(result);

	}

	public void q1316() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int cnt = 0;

		for(int k=0; k<n; k++){

		  List<Character> list = new ArrayList<Character>();
		  boolean flag = true; 

		  String str = br.readLine();

		  char prev = str.charAt(0);
		  list.add(prev);

		  for(int i=1; i<str.length(); i++){
			char c = str.charAt(i);
			if(c!=prev && list.contains(c)){
				flag = false; 
				break; 
			}
			list.add(c);
			prev = c; 
		  }

		  if(flag){
			cnt++;
		  }
		}

		System.out.println(cnt);

	}
	
	
	public void q2941() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
		String str = br.readLine();
		String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};

		for(String a:arr){
		  if(str.contains(a)){
			str = str.replaceAll(a," ");
		  }
		}

		System.out.println(str.length());
	}
	
	public void q5622() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] input =  br.readLine().trim().toCharArray();

		int count = 0;
		for(char c:input){

		  switch(c) {
			case 'A' : case 'B': case 'C' : 
					count += 3;
					break;

				case 'D' : case 'E': case 'F' : 
					count += 4;
					break;

				case 'G' : case 'H': case 'I' : 
					count += 5;
					break;

				case 'J' : case 'K': case 'L' : 
					count += 6;
					break;	

				case 'M' : case 'N': case 'O' : 
					count += 7;
					break;	

				case 'P' : case 'Q': case 'R' : case 'S' : 
					count += 8;
					break;	

				case 'T' : case 'U': case 'V' : 
					count += 9;
					break;	

				case 'W' : case 'X': case 'Y' : case 'Z' : 
					count += 10;
					break;	
		  }
		}

		System.out.println(count);

		
	}
	
	public void q2908() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
		String str = br.readLine().trim();
		String[] arr = str.split(" ");
		String[] result ={"",""};

		for(int i=0; i<arr.length; i++){
		  String[] sArr = arr[i].split("");

		  for(int k=sArr.length-1; k>=0; k-- ){
			result[i] += sArr[k];
		  }
		}

		int A = Integer.parseInt(result[0]); 
		int B = Integer.parseInt(result[1]); 

		System.out.println(A > B ? A : B);
	}	
		
	public void q1152() throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
		String str = br.readLine().trim();
		String[] arr = str.split(" ");

		int cnt = 0 ;
		for(String a : arr){
		  if(a.length() > 0){
			cnt++;
		  }
		}
		System.out.println(cnt);
	}
		
	public void q1157() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
		String str = br.readLine();
		String[] arr = str.split("");
		HashMap<String,Integer> map = new HashMap<String,Integer>();

		for(int i=0; i<arr.length; i++){
		  int cnt = 0;
		  String c = arr[i].toLowerCase(); 
		  if(map.get(c)!= null){
			cnt = map.get(c); 
		  }

		  map.put(c,cnt+1);
		}

		String rst = "";
		int maxCnt = 0;

		Set<String> keys = map.keySet();
		for (String key : keys) {

		  int cnt = map.get(key); 
		  if(cnt > maxCnt){
			rst = key; 
			maxCnt = cnt;
		  }else if(cnt == maxCnt){
			rst = "?";
		  }
		}
		System.out.println(rst.toUpperCase());
		
	}
	public void q10809() throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		String str = br.readLine();
    
		for(char c = 'a' ; c <= 'z' ; c++){
			 System.out.print(str.indexOf(c)+" ");
		}
	}
		
	
	public void q11720() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		String[] arr = str.split("");
		int sum =0;

		for(int i=0; i<arr.length; i++){
		  sum += Integer.parseInt(arr[i]);  
		}


		System.out.println(sum);
	}
	
	public void q11654() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
		String a = br.readLine().trim();
    	int n = a.charAt(0); 
		
    	System.out.println(n);
	}
	
	public void q1065() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int n = Integer.parseInt(br.readLine().trim());
   		int cnt =0; 

    	for(int i=1; i<=n; i++){   
     
			boolean flag = true; 
			if(i>99){
				  int num =i; 
				  int diff =0; 
				  int curr = 0;
				  int next = 0; 

				  curr = num%10;
				  num  = num/10;
				  next = num%10; 
				  diff = next-curr; 

				  while(num/10 != 0){
						curr =  next;
						num  = num/10; 
						next = num%10; 
						if(diff != (next-curr)){
						  flag = false; 
						  break; 
						}
				  }  
		   }

		  if(flag){
			cnt++; 
		  }

		}
		System.out.println(cnt);
	}
	
	
	//===============================================================
	// 2020-09-21 (월)
    //===============================================================
	public void q4673(){
		int n = 10000;
		boolean[] arr = new boolean[n];


		for(int i=0; i<n; i++){

			int num =i; 
			int sum =num;
			do{
			  sum += num%10;
			  num = num/10;
			}while((num != 0));

			if(sum<n){
			  arr[sum] = true;
			}

		}

		for(int j=0; j<arr.length; j++){
		  if(!arr[j]) System.out.println(j);
		}
	
	}
		
		
	public void q4344() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());  

		for(int i=0; i<n; i++){
		  String str = br.readLine();  
		  StringTokenizer st = new StringTokenizer(str);

		  int cnt = Integer.parseInt(st.nextToken());
		  int[] arr = new int[cnt];
		  int sum = 0;
			for(int k=0; k<cnt; k++){
			int num = Integer.parseInt(st.nextToken());
			arr[k] = num; 
			sum += num; 
		  }

		  double avg = sum/cnt; 
		  int moreCnt = 0;
		  for(int j=0; j<arr.length; j++){
			if(arr[j] > avg) moreCnt++; 
		  }

		  System.out.println(String.format("%.3f", (moreCnt/(double)cnt)*100)+"%");
		}
	}
	
	public void q8958() throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());  


		for(int i=0; i<n; i++){
		  String str = br.readLine();  
		  String[] arr = str.split("");
		  int num = 0;
		  int sum = 0;
		  for(int j=0; j<arr.length; j++){

			if(arr[j].equals("O")){
			  num++;
			  sum += num;
			}else{
			  num = 0;
			}
		  }

		  System.out.println(sum);
		}
    
	}
		
		
	public void q1546() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());  
    String str = br.readLine();  
    
    
    double max = 0; 
    StringTokenizer st = new StringTokenizer(str);
	  int[] arr = new int[n];
	  for(int i=0; i<n; i++){
  	  int num = Integer.parseInt(st.nextToken());
  	  arr[i] = num;
  	  if(num > max){
  	    max = num; 
  	  }
	  }  

	  float sum = 0;
	  for(int i=0; i<arr.length; i++){
	    sum += (arr[i]/max)*100;
	  }
	  
	  System.out.println(sum/n);
	  
	}
		
		  
	//===============================================================	
	// 2020-09-16 (수)
    //===============================================================
    
    //숫자의 개수 
    public void q2577() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int A = Integer.parseInt(br.readLine());  
      int B = Integer.parseInt(br.readLine());  
      int C = Integer.parseInt(br.readLine());  
      
      int num = A*B*C;
      System.out.println(num);
      String str = Integer.toString(num);
      String[] arr = str.split("");
      int[] result = new int[10];
      
      for(int i=0; i<result.length; i++){
        for(int j=0; j<arr.length; j++){
          if(i == Integer.parseInt(arr[j])){
            result[i] = result[i]+1;   
          }
        }
      }
      
      for(int j=0; j<result.length; j++){
        System.out.println(result[j]);  
      }
    }
    
    //최댓값
    public void q2562() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = 9;
  
      int max = 0;
      int idx = 0;
      for(int i =0; i<n; i++){
        int num = Integer.parseInt(br.readLine());  
        
        if(max < num){
          max = num;
          idx = i+1;
        }
      }
      
      System.out.println(max);
      System.out.println(idx);
    }
    
    //최소, 최대
    public void q10818() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine().trim());
      String str = br.readLine();
      String[] strArr = str.split(" ");
    
      int[] arr = new int[n];  
      for(int i =0; i<n; i++){
        arr[i] = Integer.parseInt(strArr[i]);
      }
      
      int max = arr[0];
      int min = arr[0];
      for(int i=0; i<n; i++){
        if(max < arr[i]){
          max = arr[i];
        }
        
        if(min>arr[i]){
          min = arr[i];
        }
      }
      
      System.out.println(min+" "+max);
      
    }
    
    //별 찍기 - 21
    public void q10996(){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int harf = n/2+n%2;
      System.out.println("harf : "+harf);
          
      for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
          if(j==harf) System.out.print("\n"); 
          if(j>0) System.out.print(" "); 
          System.out.print("*"); 
             
        }  
        System.out.print("\n"); 
      }
    }
    
	//===============================================================	
	// 2020-09-15 (화)
    //===============================================================
	
	//별 찍기 - 9
	public void q2446() {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int len = n*2-1;
		for(int i=0; i<n; i++){
			for(int j=0; j<len-i; j++){
				if(j<i){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}
		for(int i=n-1; i>0; i--){
			for(int j=0; j<len-i+1; j++){
				 if(j<i-1){
					System.out.print(" ");
				 }else{
				 	System.out.print("*");
				 }
			}
			System.out.print("\n");
		}
		
	}
	
	//별 찍기 - 13
	public void q2523() {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		
		int len = 2*n-1; 
		int harf = len/2+len%2; 
		for(int i=0; i<harf; i++){
			for(int j=0; j<=i; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		for(int i=len-harf-1; i>=0; i--){
			for(int j=0; j<=i; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}
	
	//세 수
	public void q10817() {
		
		Scanner sc = new Scanner(System.in);
        int [] a = new int [3];

        for (int i=0; i<3; i++)
            a[i] = sc.nextInt();

        Arrays.sort(a);

		System.out.println(a[1]);
		
		
	}
		
	
	
	
	//===============================================================	
	// 2020-09-14 (월)
    //===============================================================
	
	//상근날드 
	public void q5543() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int burger = 0;
		int drink  = 0; 
		for(int i=0; i<3; i++){
			int num = Integer.parseInt(br.readLine());
			if(burger == 0) burger = num;
			
			if(num < burger){
				burger = num;
			}
		}
		
		for(int i=0; i<2; i++){
			int num = Integer.parseInt(br.readLine());
			if(drink == 0) drink = num;
			
			if(num < drink){
				drink = num;
			}
		}
		
		System.out.println(burger+drink-50);
	}
	
	//평균점수
	public void q10039() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = 0;
		int sum = 0;
		while(cnt < 5){
			int num = Integer.parseInt(br.readLine());
			if(num < 40) num = 40;
			sum+=num;  
			cnt++;
		}
		
		System.out.println(sum/cnt);
		
	}
	
	//더하기 사이클 
	public int q1110(int n) throws IOException{
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int num = Integer.parseInt(br.readLine());
		int num = n; 
		
		int cnt = 0; 
		int target = num; 
		
		do{
			num = (num%10)*10 + (((num/10)+(num%10))%10);
			cnt++;
			
		}while(num != target);
			
		return cnt; 
		
	}
	
	//===============================================================	
	// 2020-09-10 (목)
    //===============================================================
	
	//A+B -5
	public void q10952() throws IOException {
		Scanner sc = new Scanner(System.in);
		boolean flag = true; 
		while(flag){
			int a = sc.nextInt();
			int b = sc.nextInt();

			if(a == 0 && b == 0){
				flag = false; 		
			}else{
				System.out.println(a+b);
			}
		}
   }
	
	//A+B -4
	public void q10951() throws IOException {
		Scanner sc = new Scanner(System.in);
		
		while( sc.hasNextInt()) { 
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
	
   }
	
    //===============================================================
    // 2020-09-09 (수)
    //===============================================================
    //구구단
    public void q2739(int n){
        for(int i=1; i<10; i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
    
    //빠른 A+B
    public void q15552() throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine().trim());
        for (int i=0; i < n; i++) {
            String text = br.readLine();
            String[] word = text.split(" ");
            int a = Integer.parseInt(word[0]);
            int b = Integer.parseInt(word[1]);
            bw.write((a+b) + "\n");
        }
        
        bw.flush();
        bw.close();
            
        
    }
    
    //N 찍기
    public void q2741() throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine().trim());
        for (int i=1; i <= n; i++) {
			
            bw.write(i + "\n");
        }
		
        bw.flush();
        bw.close();
		
    }
	
	 //A+B - 7
    public void q11021() throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine().trim());
		
        for (int i=1; i <= n; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
            bw.write("Case #"+i+": "+(a+b)+"\n");
        }
		
        bw.flush();
        bw.close();
		
    }
	
	 //A+B - 8
    public void q11022() throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine().trim());
		
        for (int i=1; i <= n; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
            bw.write("Case #"+i+": "+a+" + "+b+" = "+(a+b)+"\n");
        }
		
        bw.flush();
        bw.close();
		
    }
	
	//별 찍기 - 1
    public void q2438() throws IOException {
            
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int n = Integer.parseInt(br.readLine().trim());
		
        for (int i=1; i <= n; i++) {
			for (int j=1; j<=i; j++) {
				bw.write("*");
			}
			bw.write("\n");
        }
		
        bw.flush();
        bw.close();
		
    }
    
	//별 찍기 - 2
    public void q2439() throws IOException {
            
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int n = Integer.parseInt(br.readLine().trim());
		
        for (int i=1; i <= n; i++) {
			for (int k=1; k<=n-i; k++) {
				bw.write(" ");
			}
			for (int j=1; j<=i; j++) {
				bw.write("*");
			}
			bw.write("\n");
        }
		
        bw.flush();
        bw.close();
		
    }
	
	//X보다 작은 수 
	public void q10871() throws IOException {
            
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str);
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
	
		String str2 = br.readLine();
		StringTokenizer arr = new StringTokenizer(str2);
		for (int i=0; i<N; i++) {
			
			int n = Integer.parseInt(arr.nextToken());
			if(n < X){
				bw.write(n+ " ");
			}
		}
		
        bw.flush();
        bw.close();
		
    }
	
    //===============================================================
    // 2020-09-08 (화)
    //===============================================================
    
    //2753번 윤년 
    public int q2753(int num){
        if((num%4 == 0 && num%100 != 0) || num%400 == 0){
            return 1; 
        }
        return 0;
        
    }
    
    //14681번 사분면 
    public int q14681(int x, int y){
        
        if(x > 0 && y > 0){
            return 1;
        }else if(x < 0 && y > 0){
            return 2;
        }else if(x < 0 && y < 0){
            return 3;
        }else if(x > 0 && y < 0){
            return 4;
        }
        
        return 0;
        
    }
    
    //2884번 알람시계
    public String q2884(int H, int M){
        
        int setTime = 45;
        
        if(M < setTime){
            M += 60;
            H--;
        
        }
        M -= setTime;
        
        if(H < 0){
            H = 23;
        } 
        
        String result = H+" "+M;
        return result;
    }
}