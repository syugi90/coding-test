package project;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Boj{

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