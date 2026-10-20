.class public abstract Lr1/d;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lr1/o;

.field public static final b:Lr1/o;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr1/o;

    sget-object v1, Lr1/b;->p:Lr1/b;

    invoke-direct {v0, v1}, Lr1/a;-><init>(Lc9/e;)V

    sput-object v0, Lr1/d;->a:Lr1/o;

    new-instance v0, Lr1/o;

    sget-object v1, Lr1/c;->p:Lr1/c;

    invoke-direct {v0, v1}, Lr1/a;-><init>(Lc9/e;)V

    sput-object v0, Lr1/d;->b:Lr1/o;

    return-void
.end method
