package Lesson.L04.EX01;

public class PersonHelper {
    public Person generatePerson(String data){
        Person person = new Person();
        person.setName(data.substring(Constants.NAME_START,Constants.NAME_END).trim());
        person.setSurname(data.substring(Constants.SURNAME_START,Constants.SURNAME_END).trim());
        person.getAddress().setStreet(data.substring(Constants.STREET_START,Constants.STREET_END).trim());
        person.getAddress().setFlatNo(data.substring(Constants.FLAT_NO_START,Constants.FLAT_NO_END).trim());
        person.getAddress().setCh(data.substring(Constants.CH_START,Constants.CH_END).trim());
        person.getAddress().setHouseNo(data.substring(Constants.HOUSE_NO_START,Constants.HOUSE_NO_END).trim());
        person.getAddress().setPostalCode(data.substring(Constants.POSTAL_CODE_START,Constants.POSTAL_CODE_END).trim());
        person.getAddress().setCity(data.substring(Constants.CITY_START,Constants.CITY_END).trim());
        person.setCompany(data.substring(Constants.COMPANY_START,Constants.COMPANY_END).trim());
        person.setJob(data.substring(Constants.JOB_START,Constants.JOB_END).trim());
        return person;
    }
}
