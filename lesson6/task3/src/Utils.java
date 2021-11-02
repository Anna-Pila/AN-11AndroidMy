public class Utils {
    static boolean rangeCheck(int nOne, int nTwo, int nThree, int minInt, int maxInt) {
        boolean examinationMin = ((nOne < minInt) || (nTwo < minInt) || (nThree < minInt));
        boolean examinationMax = ((nOne > maxInt) || (nTwo > maxInt) || (nThree > maxInt));
        if (examinationMin || examinationMax ) {
            return false;
        }
        return true;
    }
}
