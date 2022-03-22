package .vscode.Git;
/**
 * java0322
 */
public class java0322 {
    public static void main(String[] args) {
        System.out.println("
            깃허브 commit 연동 
            git init 
            git add . --모든파일 업로드
            git add java0322.java --java0322파일만 업로드
            git status --바뀐부분 확인
            git commit -m "commit msg" -- 커밋 메세지
            git remote add origin https://github.com/Anhyunju/git_hj.git -- 경로설정
            git push origin master --업로드

            git remote -v
            git remote rm origin
            git remote add origin https://github.com/Anhyunju/git_hj.git
            
            에러시 git pull origin master --allow-unrelated-histories

            브런치 main으로 변경 
            git branch -M main/master
            git push origin main/master
              
        ");
    }
    
}
