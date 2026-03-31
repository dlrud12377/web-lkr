package ex1_final;

public class EarthExample {
	
	public static void main(String[] args) {
		// 상수 읽기
		// static이 명시되어 있어 객체를 정의할 필요가 없음
		System.out.println("지구의 반지름(장단축 평균) : " + Earth.EARTH_RADIUS + "km");
		System.out.println("지구의 표면적(구라고 가정) : " + Math.round(Earth.EARTH_SURFACE_AREA) + "km^2");
	}

}
