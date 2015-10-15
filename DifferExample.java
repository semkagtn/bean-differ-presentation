class PointDiffer implements Differ {
  @Override
  public List<Diff> compare(Object l, Object r) {
      /* ... */
  }

  // other methods
}
Differ differ = new PointDiffer();
Point p1 = new Point(1.0, 1.0);
Point p2 = new Point(2.0, 3.0);
differ.compare(p1, p2);
