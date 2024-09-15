import sys
import threading
def main():
    import sys
    sys.setrecursionlimit(1 << 25)
    n = int(sys.stdin.readline())
    a_str, b_str, c_str = sys.stdin.readline().split()
    a = int(a_str)
    b = int(b_str)
    c = int(c_str)
    xi_list = list(map(int, sys.stdin.readline().split()))
    n = len(xi_list)

    dp_i = 0
    S_i = 0

    # Convex Hull Trick implementation
    class LineContainer:
        def __init__(self):
            self.lines = []

        # Function to determine whether the middle line is unnecessary
        def bad(self, l1, l2, l3):
            # Avoid division to prevent precision issues
            return (l3.c - l1.c) * (l1.m - l2.m) <= (l2.c - l1.c) * (l1.m - l3.m)

        def add(self, m, c):
            # Add new line y = m x + c
            new_line = Line(m, c)
            self.lines.append(new_line)
            # Remove previous lines that are unnecessary
            while len(self.lines) >= 3 and self.bad(self.lines[-3], self.lines[-2], self.lines[-1]):
                del self.lines[-2]

        def query(self, x):
            # Query maximum y value at x using binary search
            l, r = 0, len(self.lines) - 1
            res = float('-inf')
            while l <= r:
                mid = (l + r) // 2
                y_mid = self.lines[mid].get(x)
                if mid + 1 < len(self.lines):
                    y_next = self.lines[mid + 1].get(x)
                    if y_next >= y_mid:
                        l = mid + 1
                    else:
                        r = mid - 1
                else:
                    res = y_mid
                    break
            if res == float('-inf'):
                res = self.lines[l].get(x)
            return res

    class Line:
        def __init__(self, m, c):
            self.m = m
            self.c = c

        def get(self, x):
            return self.m * x + self.c

    cht = LineContainer()
    cht.add(0, 0)

    for i in range(n):
        x_i = xi_list[i]
        S_i += x_i
        # Query the maximum value at S_i
        val = cht.query(S_i)
        # Compute dp_i
        dp_i = a * S_i * S_i + b * S_i + c + val
        # Compute new line to add
        H_i = dp_i + a * S_i * S_i - b * S_i
        m_i = -2 * a * S_i
        cht.add(m_i, H_i)

    print(dp_i)

threading.Thread(target=main).start()
