interface CompareStrategy {
    Differ getDefaultDiffer(BeanField field);

    default Differ getCustomDiffer(
            BeanField field) {
        return null;
    }

    default Differ getCustomOrDefaultDiffer(
            BeanField field) {
        Differ customDiffer =
            getCustomDiffer(field);
        if (customDiffer != null) {
            return customDiffer;
        }
        return getDefaultDiffer(field);
    }
}
