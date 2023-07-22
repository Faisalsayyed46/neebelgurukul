package day5assignment;
import java.util.Scanner;

class competitionLog{
	public static int totalPieces;
	private int playerNumber;
	private String completeSet;
	private String incompleteSet;
	private int pieceBuilt;
	
	competitionLog(){}
	competitionLog(int playerNumber,String completeSet,String incompleteSet,int pieceBuilt){
		this.playerNumber=playerNumber;
		this.completeSet=completeSet;
		this.incompleteSet=incompleteSet;
		this.pieceBuilt=pieceBuilt;	
	}
	public int getPlayerNumber() {
		return playerNumber;
	}
	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}
	public String getCompleteSet() {
		return completeSet;
	}
	public void setCompleteSet(String completeSet) {
		this.completeSet = completeSet;
	}
	public String getIncompleteSet() {
		return incompleteSet;
	}
	public void setIncompleteSet(String incompleteSet) {
		this.incompleteSet = incompleteSet;
	}
	public int getPieceBuilt() {
		return pieceBuilt;
	}
	public void setPieceBuilt(int pieceBuilt) {
		this.pieceBuilt = pieceBuilt;
	}
	

	 public String toString() {
		return "Player " + playerNumber + " completed the following sets: " + completeSet + "\n" + "Player "
			+ playerNumber + " did not completed the following sets: " + incompleteSet + "\n" + "Player "
			+ playerNumber + " built total of " + pieceBuilt + " pieces";
	 }
	
}

public class LegoSetcompetition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Lego Set Competition!");
		System.out.println("Enter the name of Lego Set 1");
		String legoSet1 = sc.nextLine();
		System.out.println("Enter the number of pieces in Lego Set 1");
		int LegoPieces1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name of Lego Set 2");
		String legoSet2 = sc.nextLine();
		System.out.println("Enter the number of pieces in Lego Set 2");
		int LegoPieces2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name of Lego Set 3");
		String legoSet3 = sc.nextLine();
		System.out.println("Enter the number of pieces in Lego Set 3");
		int LegoPieces3 = sc.nextInt();

		competitionLog.totalPieces = LegoPieces1 + LegoPieces2 + LegoPieces3; 
		
	}

}
