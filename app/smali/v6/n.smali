.class public final Lv6/n;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:[B

.field public final d:Li7/b1;

.field public final e:Li7/t1;

.field public final f:I

.field public final g:Ljava/lang/String;

.field public final h:Lv6/b;


# direct methods
.method public constructor <init>(Le7/f;Ljava/lang/Object;[BLi7/b1;Li7/t1;ILjava/lang/String;Lv6/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv6/n;->a:Ljava/lang/Object;

    iput-object p2, p0, Lv6/n;->b:Ljava/lang/Object;

    array-length p1, p3

    invoke-static {p3, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Lv6/n;->c:[B

    iput-object p4, p0, Lv6/n;->d:Li7/b1;

    iput-object p5, p0, Lv6/n;->e:Li7/t1;

    iput p6, p0, Lv6/n;->f:I

    iput-object p7, p0, Lv6/n;->g:Ljava/lang/String;

    iput-object p8, p0, Lv6/n;->h:Lv6/b;

    return-void
.end method
