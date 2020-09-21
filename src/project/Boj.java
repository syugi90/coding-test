package project;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Scanner;

public class Boj{

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
	
	//별 찍기 - 21
	public void q10996(){
		System.out.print("========= 시작========\n");
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		for(int i=0; i<n; i++){
			
		}
		
	}
	
	
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