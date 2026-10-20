.class public final Lr3/b;
.super Landroidx/lifecycle/x0;


# static fields
.field public static final b:Landroidx/fragment/app/a1;


# instance fields
.field public final a:Lq/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/fragment/app/a1;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroidx/fragment/app/a1;-><init>(I)V

    sput-object v0, Lr3/b;->b:Landroidx/fragment/app/a1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/lifecycle/x0;-><init>()V

    new-instance v0, Lq/a0;

    invoke-direct {v0}, Lq/a0;-><init>()V

    iput-object v0, p0, Lr3/b;->a:Lq/a0;

    return-void
.end method


# virtual methods
.method public final onCleared()V
    .locals 6

    iget-object v0, p0, Lr3/b;->a:Lq/a0;

    iget v1, v0, Lq/a0;->c:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-gtz v1, :cond_1

    iget-object v4, v0, Lq/a0;->b:[Ljava/lang/Object;

    move v5, v3

    :goto_0
    if-ge v5, v1, :cond_0

    aput-object v2, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    iput v3, v0, Lq/a0;->c:I

    return-void

    :cond_1
    iget-object v0, v0, Lq/a0;->b:[Ljava/lang/Object;

    aget-object v0, v0, v3

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V

    throw v2
.end method
