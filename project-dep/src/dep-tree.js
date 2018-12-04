"use strict";
exports.__esModule = true;
var DepTree = /** @class */ (function () {
    function DepTree() {
        this.root = {
            children: new Map()
        };
    }
    /**
     * Each node must be added to root before adding it to the parent
     * @param nodeName
     * @param parentName
     */
    DepTree.prototype.add = function (nodeName, parentName) {
        if (!nodeName) {
            return;
        }
        var testIsChild = true;
        var node = this.root.children.get(nodeName);
        if (!node) {
            testIsChild = false;
            node = {
                children: new Map()
            };
            this.root.children.set(nodeName, node);
        }
        if (parentName) {
            var parent_1 = this.root.children.get(parentName);
            if (parent_1) {
                var doAdd = !testIsChild || !this.testChild(nodeName, parentName);
                if (doAdd) {
                    parent_1.children.set(nodeName, node);
                }
            }
        }
    };
    DepTree.prototype.testChildR = function (parentName, childName) {
        var node = this.root.children.get(parentName);
        if (node) {
            if (node.children.get(childName)) {
                return true;
            }
            for (var _i = 0, _a = node.children.keys(); _i < _a.length; _i++) {
                var child = _a[_i];
                if (this.testChildR(child, childName)) {
                    return true;
                }
            }
        }
        return false;
    };
    DepTree.prototype.testChild = function (parentName, childName) {
        var nodeParent = this.root.children.get(parentName);
        if (nodeParent) {
            var chain = [];
            chain.push.apply(chain, nodeParent.children.keys());
            // tslint:disable-next-line:prefer-for-of
            for (var idx = 0; idx < chain.length; ++idx) {
                if (chain[idx] === childName) {
                    return true;
                }
                var node = this.root.children.get(chain[idx]);
                if (node) {
                    var _loop_1 = function (testChild) {
                        if (!chain.some(function (childInChain) { return childInChain === testChild; })) {
                            chain.push(testChild);
                        }
                    };
                    for (var _i = 0, _a = node.children.keys(); _i < _a.length; _i++) {
                        var testChild = _a[_i];
                        _loop_1(testChild);
                    }
                }
            }
        }
        return false;
    };
    return DepTree;
}());
exports.DepTree = DepTree;
