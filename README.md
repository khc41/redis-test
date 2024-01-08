# redis-test
docker나 직접 설치를 통해서 redis를 실행시킨 상태여야 한다.

### docker를 이용한 redis 설치 / 실행
#### docker에서 redis의 latest 버전 이미지 가져오기
```
docker pull redis 
```

#### 6379번 포트로 redis를 실행
```
docker run --name myredis -d -p 6379:6379 redis
```
<img src="https://velog.velcdn.com/images/khc41/post/c0ed58ba-3404-4b41-b7de-411fb827267b/image.png">


#### docker에서 redis 접속 
```
docker exec -it myredis /bin/sh
```

#### redis-cli로 테스트
```
redis-cli
```
<img src="https://velog.velcdn.com/images/khc41/post/919b63e3-171c-46ee-9f29-2e77196c82b1/image.png" width="40%">


<br>
<br>
<br>
