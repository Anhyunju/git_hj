/*
            깃허브 commit 연동
            git init 
            git add . --모든파일 업로드
            git add java0322.java --java0322파일만 업로드
            git status --바뀐부분 확인
            git commit -m 'commit msg' -- 커밋 메세지
            git remote add origin https://github.com/Anhyunju/git_hj.git -- 경로설정
            git push origin master --업로드

            git remote -v
            git remote rm origin
            git remote add origin https://github.com/Anhyunju/git_hj.git
            
            에러시 git pull origin master --allow-unrelated-histories

            * 브런치 변경 
            git branch -M main/master
            git push origin main/master


            * push
            현재폴더를 그대로 업로드 하는것이 아니라 지금까지의 이력/버전(commit)을 push

            * pull
            git pull이란 원격 저장소의 정보를 가져오면서
            자동으로 로컬 브랜치에 병합(Merge)까지 수행해주는 명령어이다. 
            
            원격저장소 변경사항(이력)을 받아옴
            다른 작업환경에서 작업하거나 공동작업에서 타인이 commit 하여 이력이 변경 되었을때 
            pull을 통해 가져온 후 작업 진행 
            
            * git pull 안먹힐때 (Already up to date)
            git fetch --all
            git reset --gard origin/main (mian->origin/main으로 강제 리셋)
            이렇게 할 경우 현재 로컬에만 있는 코드들은 날아갈 수 있으니 주의   


            * git log 
            커밋한 로그 확인 
            나가기 : Q

   
            * fetch
            로컬 저장소와 원격저장소의 변경사항이 다를때 이를 비교 대조하고 git merge 명령어와
            함께 최신 데이터를 반영하거나 충동문제 등을 해결 
            
            페치(fetch)는 원격 저장소의 커밋들을 로컬 저장소로 가져온다. 
            그리고 자동으로 병합(Merge)를 해주지 않기 때문에 
            본인이 직접 확인을 한 후에 병합(Merge)하는 과정을 거쳐야한다. 




                             
                     
*/
