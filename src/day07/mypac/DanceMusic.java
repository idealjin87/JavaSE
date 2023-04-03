package day07.mypac;

public class DanceMusic implements Music, Singer {
	
	private String genre;
	private String name;
	private String composer;
	private String writer;
	private String groupName;
	
	public DanceMusic() {
		this.genre = "dance";
		this.name = "ĵ��";
		this.composer = "ȫ�浿";
		this.writer = "ȫ�浿";
		this.groupName = "NCT DREAM";
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Override	// ������̼� - �ΰ����� �Ǵ� �߰���� ����. ��������ε� ��� ������ up!
	public void listen() {
		System.out.println("�ų��� �� ������ ���Ϳ�~ ��ĩ��ġ �ε�ĩ!!");
	}

	@Override
	public void sing() {
		System.out.println("Į���� �� �뷡�� �ҷ���!!");
		
	}

}