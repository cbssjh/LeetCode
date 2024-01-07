class Solution {
    public List<Integer> getRow(int rowIndex) {
        // 결과를 담을 리스트 생성합니다.
        List<Integer> result = new ArrayList<>();

        // for문
        for (int i = 0; i <= rowIndex; i++) {
            // 이전 행의 숫자를 저장할 리스트
            List<Integer> previous = result;
            // 현재 행의 숫자를 저장할 리스트
            List<Integer> current = new ArrayList<>();

            // 현재 행의 첫 번째 숫자는 항상 1
            current.add(1);

            // 두 번째 숫자부터 마지막 전 숫자까지 계산
            for (int j = 1; j < i; j++) {
                // 현재 숫자는 이전 행의 두 숫자를 더한 값
                current.add(previous.get(j - 1) + previous.get(j));
            }

            // 만약 행 번호가 1 이상이면, 현재 행의 마지막 숫자는 항상 1!
            if (rowIndex >= 1) {
                current.add(1);
            }
            // 현재 행의 결과를 최종 결과로 저장합니다.
            result = current;
        }
        return result;
    }
}