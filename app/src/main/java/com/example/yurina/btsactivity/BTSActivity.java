package com.example.yurina.btsactivity;


import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class BTSActivity extends AppCompatActivity implements View.OnClickListener {
    private RecyclerView recyclerView;
    private ArrayList<Bts> arrayList;
    private Bts bts;
    Fragment fragment;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    //private PaperAdapter paperAdapter;

    FragmentTransaction fragmentTransaction;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bts);

        recyclerView = findViewById(R.id.recyclerview);
        arrayList = new ArrayList<>();

        Btsmember();
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(new Myadapter(arrayList, this));

        findViewById(R.id.v).setOnClickListener(this);
        findViewById(R.id.jin).setOnClickListener(this);
        findViewById(R.id.jimin).setOnClickListener(this);
        findViewById(R.id.jungguk).setOnClickListener(this);
        findViewById(R.id.rapmon).setOnClickListener(this);
        findViewById(R.id.sugar).setOnClickListener(this);
        findViewById(R.id.jhope).setOnClickListener(this);

        tabLayout = findViewById(R.id.tablayout);

//        tabLayout.addTab(tabLayout.newTab().setText("뷔"));
//        tabLayout.addTab(tabLayout.newTab().setText("진"));
//        tabLayout.addTab(tabLayout.newTab().setText("지민"));
//        tabLayout.addTab(tabLayout.newTab().setText("정국"));
//        tabLayout.addTab(tabLayout.newTab().setText("랩몬스터"));
//        tabLayout.addTab(tabLayout.newTab().setText("슈가"));
//        tabLayout.addTab(tabLayout.newTab().setText("제이홉"));

        viewPager = findViewById(R.id.viewpager);


        //viewPager.setAdapter(new PaperAdapter(getSupportFragmentManager()));


    }



    public void Btsmember() {

        bts = new Bts();

        bts.setImage("https://file2.instiz.net/data/cached_img/upload/2017/11/04/5/8efef58d7f13854b3324f7d9e2dc7e9c.jpg");
        bts.setName("뷔");
        bts.setTruename("김태형");
        bts.setAge(24);
        bts.setImage2("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTobf9zKU67EkvsygG0LXtrA-0Hv3NP8YddC8rNqDRWysBwGbqI7w");
        bts.setImage3("https://i.pinimg.com/originals/73/bc/6f/73bc6f1e0b6c1004f3e292cbce8770d3.png");
        bts.setFeature("*본명: 김태형 / Kim Tae Hyung / 金 泰 亨 (성 김, 클 태, 형통할 형)\n" +
                "*활동명: 뷔 / V\n" +
                "*생년월일: 1995년 12월 30일\n" +
                "*탄생화: 납매 / 꽃말: 자애\n" +
                "*탄생석: 터키석 / 의미: 성공, 승리\n" +
                "*탄생목: 너도밤나무 / 의미: 창조\n" +
                "*별자리: 염소자리\n" +
                "*띠: 돼지띠\n" +
                "*키: 179cm\n" +
                "*몸무게: 62kg\n" +
                "*혈액형: AB형\n" +
                "*발사이즈: 270mm\n" +
                "*손목둘레: 15.7cm\n" +
                "*손 크기: 20cm\n" +
                "*옷 사이즈: 110 (XL)\n" +
                "*출신: 대구 광역시\n" +
                "*포지션: 서브보컬\n" +
                "*종교: 무교\n" +
                "*가족관계: 아버지, 어머니, 여동생, 남동생\n" +
                "*학력: 창남초등학교 - 거창중학교 - 대구제일고등학교 - 한국예술고등학교 - 글로벌사이버대학교\n" +
                "*좋아하는 음식: 잡채, 고기\n" +
                "*좋아하는 색: 검정색, 연두색, 흰색\n" +
                "*물건: 컴퓨터, 아주 큰 인형, 옷, 신발, 액세서리, 특이한 거 다 좋아함.\n" +
                "*캐스팅: 오디션을 통해 합류\n" +
                "*롤모델: 아빠.\n" +
                "*이상형: 내가 벌어 온 돈을 소중하게 쓰는 여자, 차보단 집 먼저 사는 여자, 부모님께 모든걸 쏟아부을 수 있는 여자.\n" +
                "*별명: 태태, 김스치면인연, CGV, 초코찐빵, 사차원, 뷔글, 라봉, 쩌이퍼, 뷔주얼, 코끼리\n" +
                "*취미: 먹기, 헬기타기, 달가기, 취미만들기\n" +
                "*특기: 놀기, 권투, 유도, 태권도, 절권도, 검도, 봉술, 격투기, 17:1\n" +
                "*어릴적 꿈: 위풍당당한 인생을 살고싶었다, 아버지같은 사람이 되고싶었다, 가수\n" +
                "*좋아하는 과목: 음악, 미술, 체육\n" +
                "*싫어하는 과목: 수학");

        arrayList.add(bts);

        bts = new Bts();

        bts.setImage("https://pbs.twimg.com/media/C5vjRnyVAAAhzZ2.jpg");
        bts.setName("진");
        bts.setTruename("김석진");
        bts.setAge(27);
        bts.setImage2("http://cfile28.uf.tistory.com/image/991E38475A5332F8303B71");
        bts.setImage3("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSM1uC7lAxvXeUaTvfRU8BGmKWDSnJJn6EX9GsvrLolWJz1mlc8IQ");
        bts.setFeature("*본명: 김석진 / Kim Seok Jin / 金 碩 珍 (성 김, 클 석, 보배 진)\n" +
                "*활동명: 진 / Jin\n" +
                "*생년월일: 1992년 12월 4일\n" +
                "*별자리: 사수자리\n" +
                "*탄생화: 수영 / 꽃말: 애정\n" +
                "*탄생석: 터키석 / 의미: 성공, 승리\n" +
                "*탄생목: 자작나무 / 의미: 영감\n" +
                "*띠: 원숭이띠\n" +
                "*키: 179cm\n" +
                "*몸무게: 63kg\n" +
                "*혈액형: O형\n" +
                "*발사이즈: 265mm\n" +
                "*손목둘레: 15.4cm\n" +
                "*손 크기: 18cm\n" +
                "*옷 사이즈: 115\n" +
                "*출신: 경기도 과천\n" +
                "*포지션: 서브보컬\n" +
                "*종교: 무교\n" +
                "*가족관계: 아버지, 어머니, 형\n" +
                "*학력: 보성중학교 - 보성고등학교 - 건국대학교 연극영화과\n" +
                "*좋아하는 음식: 랍스타, 고기, 냉면, 치킨, 느끼한 음식\n" +
                "*좋아하는 색: 분홍색\n" +
                "*물건: 메이플스토리 피규어, 슈퍼마리오 피규어, 닌텐도 회사 게임들.\n" +
                "*롤모델: 빅뱅의 TOP\n" +
                "*캐스팅: 건국대 등교 중 길거리 캐스팅을 통해 합류.\n" +
                "*이상형: 강아지상, 강아지 같은 성격, 착하고 요리 잘하고 자신에게 잘해주는 여자.\n" +
                "*별명: 어색하진, 잘생겼진, 어깨미남, 맏내, 개복치, 진파카, 잇진, 슥찌, 핑크공주, 센빠이, 차문남, 금이진, 기진맥진, 벙글이\n" +
                "*취미: 마리오 시리즈 인형 수집하기, 거울보기\n" +
                "*특기: 요리, 먹기, 뮤비 운전\n" +
                "*어릴적 꿈: 평범한 회사원, 연기자, 가수\n" +
                "*좋아하는 과목: 체육\n" +
                "*싫어하는 과목: 화학");

        arrayList.add(bts);

        bts = new Bts();

        bts.setImage("http://www.topstarnews.net/news/photo/first/201605/img_194251_1_org.jpg");
        bts.setName("지민");
        bts.setTruename("박지민");
        bts.setAge(24);
        bts.setImage2("https://scontent.cdninstagram.com/vp/3270cc3694c0f64d1f3ee96e42109c4e/5B384D35/t51.2885-15/s320x320/e35/28766405_1492456417543313_973062821304598528_n.jpg");
        bts.setImage3("http://fimg4.pann.com/new/download.jsp?FileID=37036214");
        bts.setFeature("*본명: 박지민 / Park Ji Min / 朴 智 旻 (후박나무 박, 지혜 지, 하늘 민)\n" +
                "*활동명: 지민 / JIMIN\n" +
                "*생년월일: 1995년 10월 13일\n" +
                "*별자리: 천칭자리\n" +
                "*탄생화: 조팝나무 / 꽃말: 단정한 사랑\n" +
                "*탄생석: 오팔 / 의미: 희망, 순결\n" +
                "*탄생목: 마가목 / 의미: 민감\n" +
                "*띠: 돼지띠\n" +
                "*키: 173.6cm\n" +
                "*몸무게: 60kg\n" +
                "*혈액형: A형\n" +
                "*발사이즈: 265mm\n" +
                "*손목둘레: 15cm\n" +
                "*손 크기: 17.5cm\n" +
                "*옷 사이즈: 100\n" +
                "*출신: 부산 광역시\n" +
                "*포지션: 메인댄서, 리드보컬\n" +
                "*종교: 무교\n" +
                "*가족관계: 아버지, 어머니, 남동생\n" +
                "*학력: 회동초등학교 - 윤산중학교 - 부산예술고등학교 - 한국예술고등학교 - 글로벌사이버대학교\n" +
                "*좋아하는 음식: 고기, 과일, 찌개류(김치찌개)\n" +
                "*좋아하는 색: 파란색, 검정색\n" +
                "*물건: 뉴에라(스냅백), 반다나\n" +
                "*롤모델: 빅뱅의 태양\n" +
                "*캐스팅: 학원 춤 선생님의 권유로 오디션을 통해 합류\n" +
                "*이상형: 딱히 없다. 성격 좋은 여자가 1번.\n" +
                "*별명: 빡지민이, 베이글남, 짐니, 3분33초, 모찌섹시, 주황머리 걔, 망개떡, 침침, 정국맘, 박뿡, 지민이 똥개애, 찌민, 근지너대, 박분홍\n" +
                "*취미: 춤, 노래, 멍 때리기\n" +
                "*특기: 팝핀, 현대무용, 눈웃음, 눈 붓기\n" +
                "*어릴적 꿈: 과학자, 미니카 선수, 무술인, 세계최고 검객, 요리사, 가수\n" +
                "*좋아하는 과목: 모든 과목 (특히 무용, 미술)\n" +
                "*싫어하는 과목: 역사");

        arrayList.add(bts);

        bts = new Bts();

        bts.setImage("http://pds.joins.com//news/component/htmlphoto_mmdata/201712/18/c4dbcca2-fc45-4f8b-ac19-f490a6121206.jpg");
        bts.setName("정국");
        bts.setTruename("전정국");
        bts.setAge(22);
        bts.setImage2("http://cfile3.uf.tistory.com/image/99BC2F33599A409B0E5058");
        bts.setImage3("http://img.insight.co.kr/static/2018/02/08/700/18hhkkl7985qpqpvur5z.jpg");
        bts.setFeature("*본명: 전정국 / Jeon Jung Kook / 田 柾 國 (밭 전, 나무 바를 정, 나라 국)\n" +
                "*활동명: 정국 / Jung Kook\n" +
                "*생년월일: 1997년 9월 1일\n" +
                "*별자리: 처녀자리\n" +
                "*탄생화: 호랑이꽃 / 꽃말: 나를 사랑해주세요.\n" +
                "*탄생석: 사파이어 / 의미: 성실, 진실\n" +
                "*탄생목: 소나무 / 의미: 독특\n" +
                "*띠: 소띠\n" +
                "*키: 179cm\n" +
                "*몸무게: 61kg\n" +
                "*혈액형: A형\n" +
                "*출신: 부산 광역시\n" +
                "*포지션: 메인보컬, 서브랩퍼, 리드댄서\n" +
                "*종교: 무교\n" +
                "*가족관계: 아버지, 어머니, 형\n" +
                "*학력: 백양초등학교 - 백양중학교 - 신구중학교 - 서울공연예술고등학교 - 글로벌사이버대학교\n" +
                "*좋아하는 음식: 빵, 피자, 밀가루 음식.\n" +
                "*좋아하는 색: 빨강색, 검정색, 흰색\n" +
                "*물건: 신발, 화장품.\n" +
                "*롤모델: 빅뱅의 G.D\n" +
                "*캐스팅: 슈스케 부산 예선 보러 갔다가 7개 회사가 캐스팅을 제안했고 현재 소속사 Big Hit 를 선택해서 캐스팅\n" +
                "*이상형: 자신을 좋아해주는 여자, 노래 잘 부르는 여자, 피부 하얗고 똑똑한 여자, 키 160이상 여자.\n" +
                "*별명: 황금막내, 근육돼지, 꾹, 황막꾹, 낼없사, 전씨걸, 전정구기, 정근, 점정국, 전루살이, 쿠키, 노츄, 토끼, 꾸꾸\n" +
                "*취미: 그림 그리기, 기타 연주, 영화 (애니메이션) 감상, 사진촬영, 운동, 게임\n" +
                "*특기: 배드민턴, 볼링, 춤, 노래, 태권도, 못 일어나기 (잠)\n" +
                "*어릴적 꿈: 센과 치히로의 행방불명 남주인공 치히로, 프로게이머, 배드민턴 선수, 가수\n" +
                "*좋아하는 과목: 음악, 미술, 체육\n" +
                "*싫어하는 과목: 그외 모든 과목을 싫어한다.\n");

        arrayList.add(bts);

        bts = new Bts();

        bts.setImage("https://i.pinimg.com/originals/84/dd/29/84dd294edabbaef14d1fb831e42f973c.jpg");
        bts.setName("랩몬스터");
        bts.setTruename("김남준");
        bts.setAge(25);
        bts.setImage2("http://www.newsculture.tv/imgdata/newsculture_tv/201701/2017011123158512.jpg");
        bts.setImage3("http://pm1.narvii.com/6312/cedcf723357954a1be8356dd871c843bb6c1f029_00.jpg");
        bts.setFeature("*본명: 김남준 / Kim Nam Joon / 金 南 俊 (성 김, 남녘 남, 준걸 준)\n" +
                "*활동명: 랩몬스터 / Rap Monster\n" +
                "*생년월일: 1994년 9월 12일\n" +
                "*별자리: 처녀자리\n" +
                "*탄생화: 클레마티스 / 꽃말: 마음의 아름다움\n" +
                "*탄생석: 사파이어 / 의미: 성실, 진실\n" +
                "*탄생목: 수양버들 / 의미: 우울\n" +
                "*띠: 개띠\n" +
                "*키: 181cm\n" +
                "*몸무게: 64kg\n" +
                "*발사이즈: 275mm\n" +
                "*손목둘레: 16cm\n" +
                "*손 크기: 20cm\n" +
                "*옷 사이즈: 97~100\n" +
                "*혈액형: A형\n" +
                "*출신: 경기도 고양시 일산\n" +
                "*포지션: 리더, 메인랩퍼\n" +
                "*종교: 무교\n" +
                "*가족관계: 아버지, 어머니, 여동생\n" +
                "*학력: 백신초등학교 - 오마초등학교 - 신일중학교 - 일산대진고등학교 - 압구정고등학교 - 글로벌사이버대학교\n" +
                "*좋아하는 음식: 고기, 칼국수\n" +
                "*좋아하는 색: 검정색\n" +
                "*물건: 옷, 컴퓨터, 책\n" +
                "*롤모델: 칸예 웨스트, 에이셥 라키\n" +
                "*캐스팅: 언더에서 랩을 하다 언터쳐블 슬리피의 눈에 들어와서 소개를 받고, 소속사 오디션을 보고 들어옴.\n" +
                "*이상형: 섹시한 여자, 목소리가 좋은 여자, 적당히 여성스러울 줄 아는 여자.\n" +
                "*별명: 핑몬, 파괴몬, 랩준, 뇌섹남, 찌몬, 낮누, 김데일리, 김덜렁, 모니\n" +
                "*특기: 랩, 작사, 작곡, 뽑기\n" +
                "*취미: 옷 사기, 한국 투어\n" +
                "*어릴적 꿈: 토끼, 아빠 경찰 문구점 사장님, 시인 혹은 작가, 회사원, 뮤지션 가수 랩퍼\n" +
                "*좋아하는 과목: 국어, 영어, 사회, 컴퓨터, 체육\n" +
                "*싫어하는 과목: 수학");

        arrayList.add(bts);

        bts = new Bts();

        bts.setImage("https://www.wowkeren.com/images/news/00168911.jpg");
        bts.setName("슈가");
        bts.setTruename("민윤기");
        bts.setAge(26);
        bts.setImage2("http://mblogthumb1.phinf.naver.net/MjAxNjExMDNfMTgg/MDAxNDc4MTYyMzk2ODMw.P7CA4hEDGAMiHeobPeu64Xs6UJijhdSGJElTz1ySlu0g.kd3Vo8Af_Bh9YCtqWTjiRpwh9cD20UlL33IxIVRyBEsg.JPEG.doosan3314/%EB%B0%A9%ED%83%84%EC%86%8C%EB%85%84%EB%8B%A8_%EC%8A%88%EA%B0%8014.jpg?type=w800");
        bts.setImage3("https://i.pinimg.com/originals/98/a9/73/98a973b6ffb32dd48b4c482ecf532e73.jpg");
        bts.setFeature("*본명: 민윤기 / Min Yoon Gi / 閔 玧 其 (위문할 민, 귀막이구슬 윤, 그 기)\n" +
                "*활동명: 슈가 / SUGA\n" +
                "*생년월일: 1993년 3월 9일\n" +
                "*별자리: 물고기자리\n" +
                "*탄생화: 낙엽송 / 꽃말: 대담\n" +
                "*탄생석: 아쿠아마린 / 의미: 젊음, 행복\n" +
                "*탄생목: 수양버들 / 의미: 우울\n" +
                "*띠: 닭띠\n" +
                "*키: 176cm\n" +
                "*몸무게: 57kg\n" +
                "*혈액형: O형\n" +
                "*발사이즈: 265mm\n" +
                "*손목둘레: 15.6cm\n" +
                "*손 크기: 19cm\n" +
                "*옷 사이즈: 100\n" +
                "*출신: 대구 광역시\n" +
                "*포지션: 리드랩퍼\n" +
                "*종교: 무교\n" +
                "*가족관계: 아버지, 어머니, 형\n" +
                "*학력: 태전초등학교 - 관음중학교 - 강북고등학교 - 압구정고등학교 - 글로벌사이버대학교\n" +
                "*좋아하는 음식: 고기\n" +
                "*좋아하는 색: 흰색\n" +
                "*물건: 카메라, 기계(전자제품),액세서리\n" +
                "*롤모델: Kanye west, Lupe fiasco, Lil wayne, Hit boy\n" +
                "*캐스팅: 소속사에서 개최한 Hit it 이라는 전국 랩 오디션에서 2등을 하여 소속사와 계약.\n" +
                "*이상형: 자기와 비슷한 사람, 차분한 성격, 현명한 사람.\n" +
                "*별명: 민슈가, 슙기력, 민슈가천재짱짱맨뿡뿡, 민군주, 슈블, 민피디, 민가마니, 슙슙이, 슦아\n" +
                "*취미: 농구, 사진 찍기, 누워있기\n" +
                "*특기: 랩, 작사, 작곡, 누워있기\n" +
                "*어릴적 꿈: 건축 디자이너, 소방관, 가수 프로듀서\n" +
                "*좋아하는 과목: 체육, 컴퓨터\n" +
                "*싫어하는 과목: 음악, 수학\n" +
                " ");

        arrayList.add(bts);

        bts = new Bts();

        bts.setImage("http://cfile220.uf.daum.net/image/2344C73653AFF61B160FEB");
        bts.setName("제이홉");
        bts.setTruename("정호석");
        bts.setAge(25);
        bts.setImage2("http://thumbnail.egloos.net/600x0/http://pds27.egloos.com/pds/201501/10/63/b0235063_54b137be5ceda.jpg");
        bts.setImage3("http://www.enewstoday.co.kr/news/photo/201707/1083243_242956_247.jpg");
        bts.setFeature("*본명: 정호석 / Jung Ho Seok / 鄭 號 錫 (나라 이름 정, 부르짖을 호, 주석 석)\n" +
                "*활동명: 제이홉 / J-Hope\n" +
                "*생년월일: 1994년 2월 18일\n" +
                "*별자리: 물병자리\n" +
                "*탄생화: 미나리아재비 / 꽃말: 천진난만\n" +
                "*탄생석: 자수정 / 의미: 성실, 평화\n" +
                "*탄생목: 삼나무 / 의미: 자신감\n" +
                "*띠: 개띠\n" +
                "*키: 177cm\n" +
                "*몸무게: 59kg\n" +
                "*발사이즈: 265mm\n" +
                "*손목둘레: 15.2cm\n" +
                "*손 크기: 18cm\n" +
                "*옷 사이즈: 100\n" +
                "*혈액형: A형\n" +
                "*출신: 광주 광역시\n" +
                "*포지션: 서브랩퍼, 메인댄서\n" +
                "*종교: 무교\n" +
                "*가족관계: 아버지, 어머니, 누나\n" +
                "*학력: 광주자인유치원 - 서일초등학교 - 일곡중학교 - 국제고등학교 - 글로벌사이버대학교\n" +
                "*좋아하는 음식: 오리지널 한국 밥상, 임금님 밥상, 김치\n" +
                "*좋아하는 색: 초록색\n" +
                "*물건: 옷, 레고, 신발, 애플 제품\n" +
                "*롤모델: Asap Rocky, J cole, 빈지노, G.D\n" +
                "*캐스팅: 오디션을 통해 합류.\n" +
                "*이상형: 책 좋아하고, 음식 잘하는 여자.\n" +
                "*별명: 호비, 호시기, 호발이, 제이홀스, 홉이, 안무팀장, 프리지아, 방탄소년단 제이홉 왤케 잘생겼죠\n" +
                "*특기: 춤, 애교, 지민이 괴롭히기\n" +
                "*취미: 인테리어, 피규어 모으기\n" +
                "*어릴적 꿈: 테니스 선수, 가수\n" +
                "*좋아하는 과목: 기술가정, 음악\n" +
                "*싫어하는 과목: 수학\n");

        arrayList.add(bts);


    }

    @Override
    public void onClick(View v) {

        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        switch (v.getId()) {


            case R.id.v: {
                fragment = new TestFragment();
                fragmentTransaction.addToBackStack(null).replace(R.id.framelayout, fragment);

                break;
            }
            case R.id.jin: {
                fragment = new Test2Fragment();
                fragmentTransaction.addToBackStack(null).replace(R.id.framelayout, fragment);

                break;
            }
            case R.id.jimin: {
                fragment = new TestFragment();
                fragmentTransaction.addToBackStack(null).replace(R.id.framelayout, fragment);

                break;
            }
            case R.id.jungguk: {
                fragment = new Test2Fragment();
                fragmentTransaction.addToBackStack(null).replace(R.id.framelayout, fragment);

                break;
            }
            case R.id.rapmon: {
                fragment = new TestFragment();
                fragmentTransaction.addToBackStack(null).replace(R.id.framelayout, fragment);

                break;
            }
            case R.id.sugar: {
                fragment = new Test2Fragment();
                fragmentTransaction.addToBackStack(null).replace(R.id.framelayout, fragment);

                break;
            }
            case R.id.jhope: {
                fragment = new TestFragment();
                fragmentTransaction.addToBackStack(null).replace(R.id.framelayout, fragment);

                break;
            }



        }


        fragmentTransaction.commit();

    }

    class Myadapter extends RecyclerView.Adapter<Myadapter.ViewHolder> {

        ArrayList<Bts> arrayList;
        Context context;
        LayoutInflater inflater;

        public Myadapter(ArrayList<Bts> arrayList, Context context) {
            this.arrayList = arrayList;
            this.context = context;
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }


        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view = inflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, final int position) {

            Glide.with(context).load((arrayList.get(position).getImage())).centerCrop().into(holder.image);

            holder.name.setText(arrayList.get(position).getName());
            holder.truename.setText(arrayList.get(position).getTruename());
            holder.age.setText(arrayList.get(position).getAge() + "");

            holder.button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, Bts2Activity.class);

                    intent.putExtra("image2", arrayList.get(position).getImage2());
                    intent.putExtra("image3", arrayList.get(position).getImage3());
                    intent.putExtra("feature", arrayList.get(position).getFeature());

                    context.startActivity(intent);
                }
            });


        }

        @Override
        public int getItemCount() {

            return arrayList.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {

            private ImageView image;
            private TextView name;
            private TextView truename;
            private TextView age;
            private TextView button;


            public ViewHolder(View View) {
                super(View);

                image = View.findViewById(R.id.image);
                name = View.findViewById(R.id.name);
                truename = View.findViewById(R.id.truename);
                age = View.findViewById(R.id.age);
                button = View.findViewById(R.id.button);

            }
        }
    }
}
