def dfs(graph, sx, sy):
    stack = [[sx, sy]]
    visited = []
    cnt = 0
    while stack:
        label = stack.pop(0)
        try:
            g = graph[label[1]][label[0]]
            if (label[0] < 0) or (label[0] > graph[0].__len__() - 1):
                continue
            if (label[1] < 0) or (label[1] >graph.__len__() - 1):
                continue
            if g == '#':
                continue
            if [label[0], label[1]] not in visited:
                # graph[label[1], label[0]] = '#'
                cnt += 1
                visited = [[label[0], label[1]]] + visited
                stack = [[label[0]+1, label[1]], [label[0]-1, label[1]], [label[0], label[1]+1], [label[0], label[1]-1]] + stack
        except IndexError:
            pass
    return cnt


if __name__ == '__main__':
    STR = []
    W, H = [int(i) for i in input().split()]
    while W != 0:
        for j in range(H):
            STR.append(list(input()))
            if '@' in STR[j]:
                sx, sy = STR[j].index('@'), j
        print(dfs(STR, sx, sy))
        STR = []
        W, H = [int(i) for i in input().split()]
