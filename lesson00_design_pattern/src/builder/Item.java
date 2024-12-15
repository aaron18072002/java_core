package builder;

import java.time.LocalDate;

/**
 * Sử dụng builder pattern để tạo đối tượng cho Item
 * --> cách1(truyền thống)
 * 
 * B1: Từ Item, nhờ Builder	tạo ra 1 đối tượng chứa full thông tin như Item
 * 		--> có đầy đủ tt giống Item
 * B2: Item muốn set bao nhiêu tt thì dùng Builder set trước rồi copy sau
 * B3: Gọi hàm build trong class Builder để build ra đối tượng Item
 * 
 * Bản thân class Item ko được phép tự tạo đối tượng
 * --> private constructor
 * Muốn Item immutable
 * --> chỉ tạo hàm getter, ko tạo hàm setter
 * 
 * class nằm bên trong class --> nested class
 * 
 * Builder là static class vì
 * + nếu non-static, muốn truy cập được Builder thì phải tạo 1 đối tượng Item
 * 	(ko hợp lí, vì nếu tạo được đối tượng Item thì ko cần Builder)
 * + tạo đối tượng Builder thông qua Item.builder() 
 */
public class Item {
	
	private int id;
	private String name;
	private Double salesPrice;
	private Double buyPrice;
	private Double tax;
	private int amount;
	private LocalDate startedDate;
	private LocalDate expiredDate;
	
	public static Builder builder() {
		return new Builder();
	}
	
	// Nested class
	public static class Builder	{
		
		private int id;
		private String name;
		private Double salesPrice;
		private Double buyPrice;
		private Double tax;
		private int amount;
		private LocalDate startedDate;
		private LocalDate expiredDate;
		
		// chỉ có setters, ko có getter
		// để mà gán trị sau khi tạo đối tượng builder
		public void setId(int id) {
			this.id = id;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
	}
	
}
