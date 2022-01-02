// import ������ ����� �ҷ�����
// firebase/app�� ��� ����� firebase��� ��ü�� �ο��Ѵٴ� ��
import firebase from "firebase/app";

// 
const firebaseConfig = {
  
  // �ٸ� ���Ͽ��� ȯ�溯���� ������ ���� ��쿡�� �ܼ��� ������ �̸��� �Է��ϴ� ���� �ƴ�
  // process.env. ���� �տ� ������ �̸���  process�� �����ؾ��Ѵ�
  // .env ������ �о� ���� �ȿ� �ִ� �������� �ҷ������ �ǹ�
  
  // process.env.REACT_APP_API_KEY�� ���� Ŭ�� �ڵ��� �� ������ �����ϴ� ������ .env�� ������ 
  // apikey���� ���Ű�� ��ü�� �ϴ°��̴�. 
  // �̷��� ������� �ڵ忡 ��� Ű�� �������� �����鼭 �����δ� ���Ű�� �Է� �� �� �ִ�.
  
  
  apikey : process.env.REACT_APP_API_KEY,
  authDomain : process.env.REACT_APP_API_AUTH_DOMAIN,
  projectId : process.env.REACT_APP_PROGECT_ID,
  storageBucket :process.env.REACT_APP_STORAGE_BUCKET,
  messagingSender:process.env.REACT_APP_MESSAGING_SENDER_ID,
  appId : process.env.REACT_APP_APP_ID
  };

  // initializeApp�Լ��� firebase ��ü���� ���� ����Ѱ�
  const app = initializeApp(firebaseConfig);

