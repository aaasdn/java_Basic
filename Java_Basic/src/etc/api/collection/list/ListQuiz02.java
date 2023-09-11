package etc.api.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListQuiz02 {

	public static void main(String[] args) {
		
		/*
        1. User 클래스를 은닉(캡슐화)된 변수 name, age로 선언해서 구현
         User클래스의 생성자는 모든 필드값을 받는 생성자 1개.

        2. User 객체를 모음저장 할 수 있는 ArrayList를 선언. (main method)
        3. User 객체를 3개 생성해서 리스트에 추가하세요. (main method)

        4. 리스트에 저장된 모든 이름, 나이를 for문으로 출력 (향상 for문)
        5. 리스트 내부 객체 중 이름이 "홍길동" 이 있다면 
              그 객체를 삭제해 주세요. (일반 for문)
		 */

		List<User>user = new ArrayList<>();

		User user1 = new User("홍길동", 28);
		User user2 = new User("한명은", 26);
		User user3 = new User("김수현", 24);

		Collections.addAll(user, user1, user2, user3);

		//      user.add(new User("홍길동", 28));
		//      user.add(new User("한명은", 26));
		//      user.add(new User("김수현", 24));

		//      Collections.addAll(user, 
		//            new User("홍길동", 28), 
		//            new User("한명은", 26), 
		//            new User("김수현", 24));

		for(User u : user) {
			System.out.println(u);
		}

		/*
        - forEach(향상 for문)을 사용하여 반복문을 순회할 때
         리스트의 크기를 마음대로 줄이거나 늘릴 수 없습니다.
        - 향상 for문은 반복문을 시작할 때 구조적으로 컬렉션의
         크기 및 사용 가능한 요소들의 개수를 항상 파악하고 있기 때문에
         값의 변경이 일어나면 예외를 발생시키도록 설계되어 있습니다.
		 */

		//      for(User u : user) {
		//         if(u.getName().equals("홍길동")) {
		//            user.remove(u);
		//            break;
		//         }
		//      }

		for(int i=0; i<user.size(); i++) {
			//         User u = user.get(i);
			if(user.get(i).getName().equals("홍길동")) {
				user.remove(i);
			}
		}

		System.out.println(user);

	}

}