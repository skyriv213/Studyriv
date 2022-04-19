package hello.itemservice.domain.repository;

import hello.itemservice.domain.item.Item;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class ItemRepositoryTest {

    // assertions 메소드
    private void check(Object A, Object B) {
        assertThat(B).isEqualTo(A);
    }

    ItemRepository itemRepository = new ItemRepository();

    @AfterEach
    void afterEach() {
        itemRepository.clearStore();
    }

    @Test
    void save() {
        //given
        Item item = new Item("ItemA", 10000, 10);
        //when
        Item saveItem = itemRepository.save(item);
        //then
        Item findItem = itemRepository.findById(item.getId());
        check(saveItem, findItem);
    }

    @Test
    void findAll() {
        //given
        Item item1 = new Item("ItemA", 10000, 10);
        Item item2 = new Item("ItemB", 20000, 20);

        itemRepository.save(item1);
        itemRepository.save(item2);
        //when
        List<Item> result = itemRepository.findAll();

        //then
        check(result.size(), 2);
        assertThat(result).contains(item1, item2);

    }

    @Test
    void update() {
        //given
        Item item1 = new Item("ItemA", 10000, 10);
        Item savedItem = itemRepository.save(item1);
        Long itemId = savedItem.getId();

        //when
        Item updateParam = new Item("Item2", 20000, 200);
        itemRepository.update(itemId, updateParam);


        //then
        Item findItem = itemRepository.findById(itemId);
        check(findItem.getItemName(), updateParam.getItemName());
        check(findItem.getPrice(), updateParam.getPrice());
        check(findItem.getQuantity(), updateParam.getQuantity());

    }
}