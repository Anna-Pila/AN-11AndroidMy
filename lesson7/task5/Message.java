package task5;

final class Message {
    Patient patient;
    boolean resultTest;

    public Message(Patient patient, boolean resultTest) {
        this.patient = patient;
        this.resultTest = resultTest;
    }

    public void myMessage(){
        final StringBuilder st = new StringBuilder();
        st.append("Дорогой ");
        st.append(" ");
        st.append(patient.name);
        if (resultTest){
            st.append(", результат вашего теста на коронавирус  положительный. Вам необходимо соблюдать режим самоизоляции в течении 7-ми дней." +
                    "\nАнтител на коронавирус в вашем организме не обнаружено. Сдайте повторно тест через 30 дней после вакцинации!");
        }
        else {
            st.append(", результат вашего теста на коронавирус  отрицательный. Вы можете ходить на работу." +
                    "\nАнтител на коронавирус в вашем организме не обнаружено. Сдайте повторно тест через 30 дней после вакцинации!");
        }
        System.out.println(st);
    }
}
