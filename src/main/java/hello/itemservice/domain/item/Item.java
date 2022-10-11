package hello.itemservice.domain.item;

import lombok.Data;

@Data //@Getter와 @Setter를 포함하고 있으나, 위험.
public class Item {

    private Long id;
    private String itemName;
    private Integer price;      // 가격
    private Integer quantity;   // 수량

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
