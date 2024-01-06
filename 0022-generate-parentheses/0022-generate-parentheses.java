class Solution {
    public List<String> generateParenthesis(int n) {
        // 생성된 괄호 조합을 저장할 리스트를 초기화합니다.
        List<String> res = new ArrayList<>();
        // 재귀 함수를 시작하며 여는 괄호로 시작합니다.
        recursive(res, "(", n - 1, n);
        // 최종적으로 생성된 괄호 조합 리스트를 반환합니다.
        return res;
    }
    
    // 유효한 괄호 조합을 생성하는 재귀 함수입니다.
    public void recursive(List<String> res, String s, int open, int close) {
        // 기본 케이스: 더 이상 여는 괄호와 닫는 괄호가 남아 있지 않으면 조합을 결과 리스트에 추가합니다.
        if (open == 0 && close == 0) {
            res.add(s);
            return;
        }

        // 재귀 케이스 1: 아직 여는 괄호가 남아 있다면 여는 괄호를 추가하고 재귀 호출합니다.
        if (open > 0) {
            recursive(res, s + "(", open - 1, close);
        }

        // 재귀 케이스 2: 닫는 괄호의 개수가 여는 괄호의 개수보다 많으면 닫는 괄호를 추가하고 재귀 호출합니다.
        if (close > open) {
            recursive(res, s + ")", open, close - 1);
        }
    }
}
