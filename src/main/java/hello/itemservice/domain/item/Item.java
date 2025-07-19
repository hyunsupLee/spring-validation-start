package hello.itemservice.domain.item;

import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.ScriptAssert;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
//@ScriptAssert(lang = "javascript", script = "_this.price * _this.quantity >= 10000 ", message = "주문가격은 10000 원을 넘어야 합니다." )
public class Item {

//    @NotNull(groups = UpdateCheck.class)
    private Long id;

//    @NotBlank (message = "공백X , {0}" , groups = {SaveCheck.class , UpdateCheck.class})// 빈값 공백을 허용하지 않음
    private String itemName;

//    @NotNull ( groups = {SaveCheck.class , UpdateCheck.class})// null 을 허용하지 않음
//    @Range( min = 1000, max = 1000000 , groups = {SaveCheck.class , UpdateCheck.class} ) // 범위안의 값
    private Integer price;

 //   @NotNull ( groups = {SaveCheck.class , UpdateCheck.class})
 //   @Max( value = 9999 , groups = {SaveCheck.class} ) // 최대 9999 까지 허용함
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
