.class public final Ls0/b;
.super Lr8/j;

# interfaces
.implements Lp0/g;


# static fields
.field public static final d:Ls0/b;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:Lr0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ls0/b;

    sget-object v1, Lt0/b;->a:Lt0/b;

    sget-object v2, Lr0/d;->c:Lr0/d;

    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>"

    invoke-static {v2, v3}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1, v1, v2}, Ls0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lr0/d;)V

    sput-object v0, Ls0/b;->d:Ls0/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lr0/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls0/b;->a:Ljava/lang/Object;

    iput-object p2, p0, Ls0/b;->b:Ljava/lang/Object;

    iput-object p3, p0, Ls0/b;->c:Lr0/d;

    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Ls0/b;->c:Lr0/d;

    invoke-virtual {v0, p1}, Lr0/d;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final e()I
    .locals 1

    iget-object v0, p0, Ls0/b;->c:Lr0/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, v0, Lr0/d;->b:I

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    new-instance v0, Ls0/c;

    iget-object v1, p0, Ls0/b;->a:Ljava/lang/Object;

    iget-object v2, p0, Ls0/b;->c:Lr0/d;

    invoke-direct {v0, v1, v2}, Ls0/c;-><init>(Ljava/lang/Object;Lr0/d;)V

    return-object v0
.end method
