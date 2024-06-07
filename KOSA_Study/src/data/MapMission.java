package data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMission {

	public static void main(String[] args) {
		// 이름, 점수를 한 쌍으로 Map 자료구조로 구현하시오. ex) 김자바: 90, 박자바: 60
		// 1. 시험 응시자만 출력
		// 2. 총점, 평균, 최고점수, 최저점수 출력 최고점수와 최저점수는 Collections => max(), min()을 참고

		Map<String, Integer> score = new HashMap<String, Integer>();
		score.put("김자바", 90);
		score.put("박자바", 60);
		score.put("이자바", 70);
		score.put("유자바", 80);

		int sum = 0;
		int min = 101;
		int max = 0;
		Set s = score.entrySet();
		Iterator iter = s.iterator();
		while (iter.hasNext()) {
			Map.Entry<String, Integer> e = (Entry<String, Integer>) iter.next();
			System.out.println(e.getKey());
			sum += e.getValue();
			if (min > e.getValue()) {
				min = e.getValue();
			}
			if (max < e.getValue()) {
				max = e.getValue();
			}
		}

		System.out.println("총점: " + sum);
		System.out.println("평균: " + (sum / score.size()));
		System.out.println("최고 점수: " + max);
		System.out.println("최저 점수: " + min);
	}

}
