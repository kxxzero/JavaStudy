package com.sist.manager;

import com.sist.vo.BoardVO;
// 파일 입출력
import java.util.*; // ArrayList, Date
import java.text.*;	// SimpleDateFormat
import java.io.*; // File 관련 => ObjectInputStream/ObjectOutputStream
public class BoardManager implements Serializable {
	// 게시물 목록 => 모아서 관리
	private static ArrayList<BoardVO> bList=new ArrayList<BoardVO>();
	
	// 값을 채움
	static
	{
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try
		{
			fis=new FileInputStream("c:\\java_data\\board.txt");
			ois=new ObjectInputStream(fis);
			bList=(ArrayList<BoardVO>)ois.readObject();
		}catch(Exception ex)
		{
			// 에러 위치 체크
			ex.printStackTrace();
		}finally
		{
			try
			{
				fis.close();
				ois.close();
			}catch(Exception ex) {}
		}
		
	}
	
	
	// 목록 출력
	public ArrayList<BoardVO> boardListData(int page)
	{
		ArrayList<BoardVO> list=new ArrayList<BoardVO>();
		   int j=0;
		   int rowSize=10;//화면에 출력하는 갯수 
		   int pagecnt=(page*rowSize)-rowSize;
		   
		   
		   ArrayList<BoardVO> temp=
				   new ArrayList<BoardVO>();
		   for(int i=bList.size()-1;i>=0;i--)
		   {
			   temp.add(bList.get(i));
		   }
		   
		   for(int i=0;i<temp.size();i++)
		   {
			   if(j<10 && i>=pagecnt)
			   {
				   BoardVO vo=temp.get(i);
				   list.add(vo);
				   j++; //10개씩만 저장 
			   }
		   }
		   return list;
		
//		/*
//		 * 	rowSize
//		 * 	1page => 0~9(인덱스 번호) => skip
//		 * 	2page => 10~19
//		 * 	3page => 20~29 
//		 */		
		
//		for(int i=0; i<bList.size(); i++)
//		{
//			if(j<10 && i>=pagecnt)
//			{
//				BoardVO vo=bList.get(i);
//				list.add(vo);
//				j++; // 10개씩만 저장
//			}
//		}
//		return list;
	}
	
	public int boardTotalPage()
	{
		return (int)(Math.ceil(bList.size()/10.0)); // ceil() : 소수점이 0이 아닌 경우에는 무조건 다 올림
	}
	
	
	// 데이터 추가 (동일한 코딩)
	public void boardInsert(BoardVO vo)
	{
		bList.add(vo); // 메모리 => 프로그램 종료 시 사라짐
		fileSave();
	}
	
	public void fileSave()
	{
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try
	    {
			fos=new FileOutputStream("c:\\java_data\\board.txt");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(bList);
	    }catch(Exception ex)
	    {
	    	// 에러 위치 확인 
	    	ex.printStackTrace();
	    }
	    finally
	    {
	    	try
	    	{
			   fos.close();
			   oos.close();
	    	}catch(Exception ex) {}
	    }
	}

	private ObjectOutputStream writeObject(ArrayList<BoardVO> bList2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	// 상세보기
	public BoardVO boardDetailData(int no)
	{
		BoardVO vo=new BoardVO();
		for(int i=0; i<bList.size(); i++)
		{
			BoardVO bVO=bList.get(i);
			if(bVO.getNo()==no)
			{
				bVO.setHit(bVO.getHit()+1); // 조회수 증가
				vo=bVO;
				fileSave(); // 파일과 ArrayList가 동일
				break;
			}
		}
		return vo;
	}
	
	
	// 수정하기 (동일한 코딩) -1
	public BoardVO boardUpdateData(int no)
	{
		BoardVO vo=new BoardVO();
		for(BoardVO bVO:bList)
		{
			if(bVO.getNo()==no)
			{
				vo=bVO;
				break;
			}
		}
		return vo;
	}
	
	// 수정하기 -2
	public String boardUpdate(BoardVO vo) // 클라이언트가 전송
	{ 
		String result=""; // YES / NO
		for(int i=0; i<bList.size(); i++)
		{
			// remove(index), set(index)
			BoardVO pVO=bList.get(i);
			// 서버에 저장
			if(pVO.getNo()==vo.getNo())
			{
				if(pVO.getPwd().equals(vo.getPwd()))
				{
					// 수정(비밀 번호가 일치한 상태)
					result="YES";
//					bList.set(i, vo); // 메모리 => 수정
					pVO.setContent(vo.getContent());
					pVO.setName(vo.getName());
					pVO.setSubject(vo.getSubject());
					fileSave(); // 파일 => 수정된 내용을 파일에 저장
					// 메모리에 저장된 내용 = 파일에 저장된 내용
				}
				else
				{
					// 비밀 번호가 틀린 상태
					 result="NO";
				}
				break;
			}
		}
		return result;
	}
	
	
	// 삭제하기 (동일한 코딩 => 파일 저장)
	public String boardDelete(int no, String pwd)
	{
		String result=""; // YES / NO
		for(int i=0; i<bList.size(); i++)
		{
			BoardVO vo=bList.get(i);
			if(vo.getNo()==no)
			{
				if(vo.getPwd().equals(pwd))
				{
					// 삭제 대상 => 비밀번호 일치
					result="YES";
					bList.remove(i);
					fileSave();
				}
				else
				{
					// 비밀번호가 클린 상태
					result="NO";
				}
			}
		}
		return result;
	}
	
	
	// 검색하기
	
	
	// 자동 증가 번호 만들기 => 시퀀스
	public int boardSequence()
	{
		int max=0;
		for(BoardVO vo:bList)
		{
			if(vo.getNo()>max)
			{
				max=vo.getNo();
			}
		}
		return max+1;
	}
	
	
	// 공통 => 파일 저장
	
}
