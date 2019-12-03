	import java.util.Scanner;
public class Lianxi3 {

	public static void main(String[] args) {
	

				String end = null;
				do {
					int score;
					int sum = 0;
					double avg = 0.0;
					Scanner input= new Scanner(System.in);
					System.out.println("请输入学生姓名:");
					String name = input.next();
					for (int i = 0; i < 5; i++) {
						System.out.println("请输入5门功课中第"+(i+1)+"门课的成绩");
						score = input.nextInt();
						sum = sum+score;
					}
					avg = sum/5;
					System.out.println(name+"的平均分是"+avg);
					System.out.println("/n继续输入么(y/n)?");
					end = input.next();
				} while (end.equals("y")||end.equals("Y"));
				System.out.println("成绩录入结束");
			}

		

	}


