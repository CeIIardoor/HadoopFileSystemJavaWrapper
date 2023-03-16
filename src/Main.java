
public class Main {

	public static void main(String[] args) {
		// sudo mount -t vboxsf VM_Shared Win_Shared
		
		Delete.rm("/user/TP2");
		ListFile.ls("/user");
		Directories.mkdir("/user/TP2");
		Copy.copyFromLocalFile("/home/cloudera/tp/Purchase.txt", "/user/copyOfPurshase.txt");
		System.out.println("--------------------------");
		ListFile.ls("/user");
	}

}
