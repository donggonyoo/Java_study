package test;

import java.io.FileWriter;
import java.io.IOException;

public class JungHwan {
	public static void main(String[] args)throws IOException {
		FileWriter w = new FileWriter("jungHwan.txt");
		w.write("https://hrd.work24.go.kr/hrdp/co/pcobo/PCOBO0100P.do?tracseId=AIG20240000471980&tracseTme=1&trainstCstmrId=500036090863&crseTracseSe=C0061&pageId=#undefined"+"\n");
		w.write("https://hrd.work24.go.kr/hrdp/co/pcobo/PCOBO0100P.do?tracseId=AIG20240000468557&tracseTme=6&trainstCstmrId=500038948890&crseTracseSe=C0061&pageId=#undefined"+"\n");
		w.write("https://hrd.work24.go.kr/hrdp/co/pcobo/PCOBO0100P.do?tracseId=AIG20230000418078&tracseTme=19&crseTracseSe=C0061&trainstCstmrId=500020021207&tracseReqstsCd=undefined&cstmConsTme=undefined#undefined"+"\n");
		w.write("여기가아마 가장 좋을듯?(구로)  ");
		w.write("https://hrd.work24.go.kr/hrdp/co/pcobo/PCOBO0100P.do?tracseId=AIG20240000498900&tracseTme=1&trainstCstmrId=500020017021&crseTracseSe=C0061&pageId=#undefined"+"\n");
		w.write("https://hrd.work24.go.kr/hrdp/co/pcobo/PCOBO0100P.do?tracseId=AIG20240000465640&tracseTme=1&crseTracseSe=C0061&trainstCstmrId=500020017021&tracseReqstsCd=undefined&cstmConsTme=undefined#undefined"+"\n");
		w.write("서울호서직업전문 (6개월짜리)  ");
		w.write("https://hrd.work24.go.kr/hrdp/co/pcobo/PCOBO0100P.do?tracseId=AIG20240000498843&tracseTme=1&crseTracseSe=C0061&trainstCstmrId=500020025468&tracseReqstsCd=undefined&cstmConsTme=undefined#undefined"+"\n");
		w.flush();
		w.close();
		
	}

}
