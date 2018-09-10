package realization;

import base.environment.Cell;
import base.interfaces.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * Реализация зоопарка.
 *
 * @author Yan Teppe.
 */
public class Zoo {
   private ArrayList<Cell> arrayCells;

   // Конструктор создает нужное кол-во клеток.
   public Zoo(int numberOfCells) {
      arrayCells = new ArrayList<Cell>(numberOfCells);
      for (int i = 0; i < numberOfCells; i++) {
         arrayCells.add(new Cell()); // Помещает в коллекцию arrayCells новую клетку.
      }
   }

   // Конструктор принимает на вход массив animal[] и создает кол-во клеток равное кол-ву животных.
   public Zoo(Animal[] animals) {
      arrayCells = new ArrayList<Cell>(animals.length);
      for (int i = 0; i < animals.length; i++) {
         arrayCells.add(new Cell(animals[i]));
      }
   }

   // Конструктор принимает на вход List animals и создает коллекцию клеток равную кол-ву животных.
   public Zoo(List<Animal> animals) {
      arrayCells = new ArrayList<Cell>(animals.size());
      for (int i = 0; i < animals.size(); i++) {
         arrayCells.add(new Cell(animals.get(i)));
      }
   }

   // Метод добовляющий клетку в коллекцию клеток.
   public void addAnimalWithCell(Cell cell) {
      arrayCells.add(cell);
   }

   // Метод добовляющий в коллекцию клетку с животным внутри.
   public void addAnimal(Animal animal) {
      arrayCells.add(new Cell(animal));
   }


   // Метод возвращает true если все клетки пустые.
   public boolean isAllCellsEmpty() {
      for (Cell cell : arrayCells) {
         if (!cell.isEmpty()) {
            return false;
         }
      }
      return true;
   }

   // Метод в который передаётся индекс клетки, возвращает true если в клетке кто-то есть
   // и false если никого нету.
   public boolean isCellEmpty(int index) {
      return arrayCells.get(index).isEmpty();
   }

   // Метод которй возвращает сколько животных.
   public int animalCount(){
      return allAnimals().size();
   }

   // Метод который возвращает List или массив всех животных.
   public List<Cell> allCells(){
      return arrayCells;
   }

   // Метод достающий список животных из клеток.
   public List<Animal> allAnimals(){
      List<Animal> animalList = new ArrayList<Animal>();
      for (Cell cell: arrayCells) {
         if(!cell.isEmpty()){
            animalList.add(cell.getAnimal());
         }
      }
      return animalList;
   }

   // Метод который по номеру клетки возвращает сообщение о том кто в клетке.
   public String whoIsInCellByIndex(int index){
     return arrayCells.get(index).whoIsInCell();
   }


   // Метод которй перечсляет все клетки по порядку и кто в них сидит.
   public void printAllCells (){
      for (int i = 0; i == arrayCells.size(); i++){
         System.out.println("Клетка №:" + (i + 1) + " в ней сидит - " + arrayCells.get(i).whoIsInCell());
      }
   }

}

// + 1. Создать класс "Зоопарк":
// + 1.1. Конструктор который создает заданное кол-во клеток.
// + 1.2. Конструктор который принимает на вход массив анимал и создает кол-во клеток равное кол-ву животных.
// + 1.3. Конструктор который принимает на вход List анимал и он создает кол-во клеток равное кол-ву животных.

// 2. Методы "Зоопарка":
// + 2.1. Метод добавляющий животного с клеткой. *
// + 2.2. Метод которй возвращает сколько животных.
// + 2.3. Метод который возвращает List или массив всех животных.
// + 2.4. Метод который по номеру клетки возвращает сообщение о том кто в клетке.
// + 2.5. Метод которй перечсляет все клетки по порядку и кто в них сидит.
// + 2.6. Метод возвращает true если все клетки пустые. *
// + 2.7. Метод в который передаётся индекс клетки, возвращает true если в клетке кто-то есть и false если никого нету.*