package hello.itemservice.domain.repository;

import hello.itemservice.domain.item.Item;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository // 어노테이션을 기입하므로써 컴포너트 스캔의 대상이 됨
public class ItemRepository {

    // static으로 선언. 스프링 컨테이너 안에서 사용시
    private static final Map<Long, Item> store = new HashMap<>();
    private static long sequence = 0L;

    public Item save(Item item) {
        item.setId(++sequence);
        store.put(item.getId(), item);
        return item;
    }

    public Item findById(Long id) {
        return store.get(id);
    }

    public List<Item> findAll() {
        return new ArrayList<>(store.values());
    }

    public void update(Long itemId, Item updateParam) {
        // 아이템 아이디를 통해 객체를 불러온다
        Item findItem = findById(itemId);
        // 불러온 아이디를 토대로 만들어진 객체의 값을 set을 이용해서 넣어준다
        findItem.setItemName(updateParam.getItemName());
        findItem.setPrice(updateParam.getPrice());
        findItem.setQuantity(updateParam.getQuantity());

    }

    public void clearStore() {
        store.clear();
    }
}
