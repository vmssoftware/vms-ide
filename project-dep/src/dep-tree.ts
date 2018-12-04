
export interface IDepNode {
    parent?: IDepNode;
    children: Map<string, IDepNode>;
}

export class DepTree {

    public root: IDepNode;

    constructor() {
        this.root = {
            children: new Map<string, IDepNode>(),
        };
    }

    /**
     * Each node must be added to root before adding it to the parent
     * @param nodeName
     * @param parentName
     */
    public add(nodeName: string, parentName?: string) {
        if (!nodeName) {
            return;
        }
        let testIsChild = true;
        let node = this.root.children.get(nodeName);
        if (!node) {
            testIsChild = false;
            node = {
                children: new Map<string, IDepNode>(),
            };
            this.root.children.set(nodeName, node);
        }
        if (parentName) {
            const parent = this.root.children.get(parentName);
            if (parent) {
                const doAdd = !testIsChild || !this.testChild(nodeName, parentName);
                if (doAdd) {
                    parent.children.set(nodeName, node);
                }
            }
        }
    }

    public testChildR(parentName: string, childName: string) {
        const node = this.root.children.get(parentName);
        if (node) {
            if (node.children.get(childName)) {
                return true;
            }
            for (const child of node.children.keys()) {
                if (this.testChildR(child, childName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public testChild(parentName: string, childName: string) {
        const nodeParent = this.root.children.get(parentName);
        if (nodeParent) {
            const chain: string[] = [];
            chain.push(...nodeParent.children.keys());
            // tslint:disable-next-line:prefer-for-of
            for (let idx = 0; idx < chain.length; ++idx) {
                if (chain[idx] === childName) {
                    return true;
                }
                const node = this.root.children.get(chain[idx]);
                if (node) {
                    for (const testChild of node.children.keys()) {
                        if (!chain.some((childInChain) => childInChain === testChild)) {
                            chain.push(testChild);
                        }
                    }
                }
            }
        }
        return false;
    }
}
