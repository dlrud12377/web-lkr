package ex3.bufferedstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberExample {
	public static void main(String[] args) {
		//members.csv 파일을 읽어서 나이가 30 이상인 회원만 senior_members.txt파일로 저장
		
		// members.csv 읽기
		
		File f = new File("members.csv");
		File f2 = new File("senior_members.txt");
		
		// 사용할 변수들 초기화
		List<String> members = new ArrayList<>();
		HashMap<String, Integer> membersAndAges = new HashMap<>();
		String line = null;

		
		if (!f.exists()) {
			System.out.println("파일이 존재하지 않습니다.");
			return;
		}
		
		// try-with-resources
		try (
			    BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("members.csv"), StandardCharsets.UTF_8));
			    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f2, true), StandardCharsets.UTF_8));
				)
		{
			// 파일 내의 정보 List에 저장
			while ((line = br.readLine()) != null) {
				members.add(line);
			}
			
			// 파일 내의 정보 split으로 나누기 + HashMap으로 저장
			for (String memberInfo : members) {
				String[] member = memberInfo.split(",");
				membersAndAges.put(member[0], Integer.parseInt(member[1]));
			}
			
			// HashMap의 정보들 중 30세 이상인 정보만 다시 적기
			for (Map.Entry<String, Integer> entry : membersAndAges.entrySet()) {
				if (entry.getValue() >= 30) {
					bw.write(entry.getKey() + "," + entry.getValue());
					bw.newLine();
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
